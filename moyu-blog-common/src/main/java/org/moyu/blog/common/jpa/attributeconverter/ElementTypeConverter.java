package org.moyu.blog.common.jpa.attributeconverter;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import org.moyu.blog.common.constant.ElementType;

/**
 * @author fuhaixin
 * @date 2022/6/28
 * @see org.moyu.blog.common.pojo.entity.ContentElement 文章元素的种类jpa属性转换器
 **/
@Converter(autoApply = true)
public class ElementTypeConverter implements AttributeConverter<ElementType, Integer> {

    /**
     * Converts the value stored in the entity attribute into the data representation to be stored
     * in the database.
     *
     * @param attribute the entity attribute value to be converted
     * @return the converted data to be stored in the database column
     */
    @Override
    public Integer convertToDatabaseColumn(ElementType attribute) {
        return Optional.ofNullable(attribute).map(ElementType::getCode)
            .orElseThrow(() -> new IllegalArgumentException("ElementType is null"));

    }

    /**
     * Converts the data stored in the database column into the value to be stored in the entity
     * attribute. Note that it is the responsibility of the converter writer to specify the correct
     * <code>dbData</code> type for the corresponding column for use by the JDBC driver: i.e.,
     * persistence providers are not expected to do such type conversion.
     *
     * @param dbData the data from the database column to be converted
     * @return the converted value to be stored in the entity attribute
     */
    @Override
    public ElementType convertToEntityAttribute(Integer dbData) {
        return Arrays.stream(ElementType.values())
            .filter(status -> Objects.equals(status.getCode(), dbData))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("ElementType is null"));
    }
}
