package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
@Entity
@Table
public class Options extends BaseEntity {


    private Long userId;
    private String name;
    private String value;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Options options)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getUserId().equals(options.getUserId()) && getName().equals(options.getName())
            && getValue().equals(options.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUserId(), getName(), getValue());
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Options() {

    }

    public Options(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, Long userId, String name, String value) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.userId = userId;
        this.name = name;
        this.value = value;
    }
}
