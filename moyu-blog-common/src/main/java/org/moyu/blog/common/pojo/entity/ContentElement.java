package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import org.moyu.blog.common.constant.ElementType;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
@Entity
@Table
public class ContentElement extends BaseEntity {

    private Long userId;
    private String categoryName;
    private String shortName;
    @Lob
    @Column(name = "`desc`")
    private String desc;
    @Column(name = "`order`")
    private Integer order;
    private String tagName;
    private ElementType type;

    public ContentElement(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, Long userId, String categoryName,
        String shortName, String desc, Integer order, String tagName, ElementType type) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.userId = userId;
        this.categoryName = categoryName;
        this.shortName = shortName;
        this.desc = desc;
        this.order = order;
        this.tagName = tagName;
        this.type = type;
    }

    public ContentElement() {
    }

    @Override
    public String toString() {
        return "ContentElement{" +
            "userId=" + userId +
            ", categoryName='" + categoryName + '\'' +
            ", shortName='" + shortName + '\'' +
            ", desc='" + desc + '\'' +
            ", order=" + order +
            ", tagName='" + tagName + '\'' +
            ", type=" + type +
            "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentElement that)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return userId.equals(that.userId) && categoryName.equals(that.categoryName)
            && shortName.equals(
            that.shortName) && desc.equals(that.desc) && order.equals(that.order) && tagName.equals(
            that.tagName) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, categoryName, shortName, desc, order, tagName,
            type);
    }
}
