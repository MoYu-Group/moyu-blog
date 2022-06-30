package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.ConstraintMode;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.moyu.blog.common.constant.ElementType.ContentElementType;

/**
 * @author fuhaixin
 * @date 2022/6/29
 **/

@Entity
@DiscriminatorValue(value = ContentElementType.CATEGORY)
public class Category extends ContentElement {

    @ManyToOne
    @JoinColumn(name = "parent_id", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Category parentCategory;
    @OneToMany(mappedBy = "parentCategory")
    private List<Category> childrenCategories;

    @OneToMany(mappedBy = "category")
    private Set<CategoryContentsRelationShip> tagContentsRelationShips = new HashSet<>();


    public Category(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, User user, String name, String shortName,
        String desc, Integer order, Category parentCategory, List<Category> childrenCategories) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted, user, name, shortName,
            desc,
            order);
        this.parentCategory = parentCategory;
        this.childrenCategories = childrenCategories;
    }

    public Category() {
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public List<Category> getChildrenCategories() {
        return childrenCategories;
    }

    public void setChildrenCategories(
        List<Category> childrenCategories) {
        this.childrenCategories = childrenCategories;
    }

    public Set<CategoryContentsRelationShip> getTagContentsRelationShips() {
        return tagContentsRelationShips;
    }

    public void setTagContentsRelationShips(
        Set<CategoryContentsRelationShip> tagContentsRelationShips) {
        this.tagContentsRelationShips = tagContentsRelationShips;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Category category)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return parentCategory.equals(category.parentCategory) && childrenCategories.equals(
            category.childrenCategories) && tagContentsRelationShips.equals(
            category.tagContentsRelationShips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parentCategory, childrenCategories,
            tagContentsRelationShips);
    }

    @Override
    public String toString() {
        return "Category{} " + super.toString();
    }
}
