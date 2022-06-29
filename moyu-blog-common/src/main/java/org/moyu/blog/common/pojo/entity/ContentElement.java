package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.INTEGER)
public abstract class ContentElement extends BaseEntity {

    @Basic(optional = false)
    private Long userId;
    @Basic(optional = false)
    private String name;
    @Basic(optional = false)
    private String shortName;

    @Lob
    @Column(name = "`desc`", nullable = false)
    private String desc;
    @Column(name = "`order`")
    @Basic(optional = false)
    private Integer order;


    protected ContentElement(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, Long userId, String name,
        String shortName, String desc, Integer order) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.userId = userId;
        this.name = name;
        this.shortName = shortName;
        this.desc = desc;
        this.order = order;

    }

    protected ContentElement() {
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
        return getUserId().equals(that.getUserId()) && getName().equals(that.getName())
            && getShortName().equals(that.getShortName()) && getDesc().equals(that.getDesc())
            && getOrder().equals(that.getOrder());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUserId(), getName(), getShortName(), getDesc(),
            getOrder());
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }


    @Override
    public String toString() {
        return "ContentElement{" +
            "userId=" + userId +
            ", name='" + name + '\'' +
            ", shortName='" + shortName + '\'' +
            ", desc='" + desc + '\'' +
            ", order=" + order +
            "} " + super.toString();
    }
}
