package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
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
@DiscriminatorValue(value = ContentElementType.TAG)
public class Tag extends ContentElement {

    @ManyToOne
    @JoinColumn(name = "parent_id", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Tag parentTag;

    @OneToMany(mappedBy = "parentTag")
    private List<Tag> childrenTags;

    @OneToMany(mappedBy = "tag")
    private Set<TagContentsRelationShip> tagContentsRelationShips = new LinkedHashSet<>();



    public Tag() {
    }

    public Tag(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, User user, String name, String shortName,
        String desc, Integer order, Tag parentTag, List<Tag> childrenTags,
        Set<TagContentsRelationShip> tagContentsRelationShips) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted, user, name, shortName,
            desc,
            order);
        this.parentTag = parentTag;
        this.childrenTags = childrenTags;
        this.tagContentsRelationShips = tagContentsRelationShips;
    }


    public Tag getParentTag() {
        return parentTag;
    }

    public void setParentTag(Tag parentTag) {
        this.parentTag = parentTag;
    }

    public Set<TagContentsRelationShip> getTagContentsRelationShips() {
        return tagContentsRelationShips;
    }

    public void setTagContentsRelationShips(
        Set<TagContentsRelationShip> tagContentsRelationShips) {
        this.tagContentsRelationShips = tagContentsRelationShips;
    }

    @Override
    public String toString() {
        return "Tag{" +
            "parentTag=" + parentTag +
            ", childrenTags=" + childrenTags +
            ", tagContentsRelationShips=" + tagContentsRelationShips +
            "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tag tag)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getParentTag().equals(tag.getParentTag()) && getChildrenTags().equals(
            tag.getChildrenTags()) && tagContentsRelationShips.equals(tag.tagContentsRelationShips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getParentTag(), getChildrenTags(),
            tagContentsRelationShips);
    }

    public List<Tag> getChildrenTags() {
        return childrenTags;
    }

    public void setChildrenTags(List<Tag> childrenTags) {
        this.childrenTags = childrenTags;
    }



}
