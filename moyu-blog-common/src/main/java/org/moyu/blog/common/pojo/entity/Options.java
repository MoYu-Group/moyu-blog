package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
@Entity
@Table
public class Options extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private User user;
    @Basic(optional = false)
    private String name;
    @Basic(optional = false)
    private String value;

    public Options() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Options)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Options options = (Options) o;
        return getUser().equals(options.getUser()) && getName().equals(options.getName())
            && getValue().equals(options.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUser(), getName(), getValue());
    }

    @Override
    public String toString() {
        return "Options{" +
            "user=" + user +
            ", name='" + name + '\'' +
            ", value='" + value + '\'' +
            "} " + super.toString();
    }

    public Options(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, User user, String name, String value) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.user = user;
        this.name = name;
        this.value = value;
    }
}
