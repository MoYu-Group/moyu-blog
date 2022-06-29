package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import org.moyu.blog.common.constant.ElementType.ContentElementType;

/**
 * @author fuhaixin
 * @date 2022/6/29
 **/

@Entity
@DiscriminatorValue(value = ContentElementType.CATEGORY)
public class CATEGORY extends ContentElement {

    public CATEGORY(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, Long userId, String name,
        String shortName, String desc, Integer order) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted, userId, name, shortName,
            desc,
            order);
    }

    public CATEGORY() {
    }

    @Override
    public String toString() {
        return "CATEGORY{} " + super.toString();
    }
}
