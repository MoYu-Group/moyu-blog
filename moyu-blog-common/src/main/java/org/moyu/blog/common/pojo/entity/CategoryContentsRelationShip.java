package org.moyu.blog.common.pojo.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author fuhaixin
 * @date 2022/6/30
 **/
@Entity
@Table(name = "relation_ship")
public class CategoryContentsRelationShip implements Serializable {

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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rel_id1", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Contents contents;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rel_id2", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Category category;

    public CategoryContentsRelationShip(Long id, Contents contents, Category category) {
        this.id = id;
        this.contents = contents;
        this.category = category;
    }

    public CategoryContentsRelationShip() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CategoryContentsRelationShip)) {
            return false;
        }
        CategoryContentsRelationShip that = (CategoryContentsRelationShip) o;
        return getId().equals(that.getId()) && getContents().equals(that.getContents())
            && getCategory().equals(that.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContents(), getCategory());
    }

    @Override
    public String toString() {
        return "CategoryContentsRelationShip{" +
            "id=" + id +
            ", contents=" + contents +
            ", category=" + category +
            '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contents getContents() {
        return contents;
    }

    public void setContents(Contents contents) {
        this.contents = contents;
    }
}
