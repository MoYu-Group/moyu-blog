package org.moyu.blog.common.pojo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {

    /**
     * Todo 将雪花算法生成器引入
     */
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "snowflake_generator"
    )
    @GenericGenerator(
        name = "snowflake_generator",
        strategy = "org.moyu.blog.common.jpa.id.SnowflakeIdGenerator"
    )
    private Long id;
    @CreatedBy
    private String createBy;
    @LastModifiedBy
    private String updateBy;
    @CreatedDate
    private LocalDateTime createTime;
    @LastModifiedDate
    private LocalDateTime updateTime;
    /**
     * Todo 在BaseRepository中填入逻辑删除功能
     */
    private Boolean isDeleted = Boolean.FALSE;

    public BaseEntity() {
    }

    public BaseEntity(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted) {
        this.id = id;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseEntity)) {
            return false;
        }
        BaseEntity that = (BaseEntity) o;
        return getId().equals(that.getId()) && getCreateBy().equals(that.getCreateBy())
            && getUpdateBy().equals(that.getUpdateBy()) && getCreateTime().equals(
            that.getCreateTime()) && getUpdateTime().equals(that.getUpdateTime())
            && isDeleted.equals(that.isDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreateBy(), getUpdateBy(), getCreateTime(), getUpdateTime(),
            isDeleted);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "BaseEntity{" + "id=" + id + ", createBy='" + createBy + '\'' + ", updateBy='"
            + updateBy + '\'' + ", createTime=" + createTime + ", updateTime=" + updateTime
            + ", isDeleted=" + isDeleted + '}';
    }
}
