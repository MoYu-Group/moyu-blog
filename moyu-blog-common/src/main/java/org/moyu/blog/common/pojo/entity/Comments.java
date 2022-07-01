package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.moyu.blog.common.constant.CommentStatus;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
@Table
@Entity

public class Comments extends BaseEntity {

    @Basic(optional = false)
    private Long ownerId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contents_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Contents contents;

    @Basic(optional = false)
    private Long userId;
    @Basic(optional = false)
    private String userName;
    @Basic(optional = false)

    private String url;
    @Basic(optional = false)

    private String ip;
    @Basic(optional = false)

    private String ipLocation;
    @Basic(optional = false)
    private String agent;
    @Basic(optional = false)

    private String comment;
    @Basic(optional = false)

    private Long likeNum;
    @Column(name = "`order`")
    @Basic(optional = false)
    private Integer order;
    @Basic(optional = false)
    private CommentStatus status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Comments parentComments;
    @OneToMany(mappedBy = "parentComments", fetch = FetchType.LAZY)
    private Set<Comments> childrenComments = new HashSet<>();

    public Comments() {
    }

    public Comments(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, Long ownerId, Contents contents, Long userId,
        String userName, String url, String ip, String ipLocation, String agent, String comment,
        Long likeNum, Integer order, CommentStatus status) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.ownerId = ownerId;
        this.contents = contents;
        this.userId = userId;
        this.userName = userName;
        this.url = url;
        this.ip = ip;
        this.ipLocation = ipLocation;
        this.agent = agent;
        this.comment = comment;
        this.likeNum = likeNum;
        this.order = order;
        this.status = status;
    }

    public Comments getParentComments() {
        return parentComments;
    }

    public void setParentComments(Comments parentComment) {
        this.parentComments = parentComment;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Contents getContents() {
        return contents;
    }

    public void setContents(Contents contents) {
        this.contents = contents;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpLocation() {
        return ipLocation;
    }

    public void setIpLocation(String ipLocation) {
        this.ipLocation = ipLocation;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Long likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public CommentStatus getStatus() {
        return status;
    }

    public void setStatus(CommentStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Comments comments)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getOwnerId().equals(comments.getOwnerId()) && getContents().equals(
            comments.getContents()) && getUserId().equals(comments.getUserId())
            && getUserName().equals(
            comments.getUserName()) && getUrl().equals(comments.getUrl()) && getIp().equals(
            comments.getIp()) && getIpLocation().equals(comments.getIpLocation())
            && getAgent().equals(
            comments.getAgent()) && getComment().equals(comments.getComment())
            && getLikeNum().equals(
            comments.getLikeNum()) && getOrder().equals(comments.getOrder())
            && getStatus() == comments.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOwnerId(), getContents(), getUserId(),
            getUserName(),
            getUrl(), getIp(), getIpLocation(), getAgent(), getComment(), getLikeNum(), getOrder(),
            getStatus());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
            "id = " + getId() + ", " +
            "createBy = " + getCreateBy() + ", " +
            "updateBy = " + getUpdateBy() + ", " +
            "createTime = " + getCreateTime() + ", " +
            "updateTime = " + getUpdateTime() + ", " +
            "isDeleted = " + getDeleted() + ", " +
            "ownerId = " + getOwnerId() + ", " +
            "userId = " + getUserId() + ", " +
            "userName = " + getUserName() + ", " +
            "url = " + getUrl() + ", " +
            "ip = " + getIp() + ", " +
            "ipLocation = " + getIpLocation() + ", " +
            "agent = " + getAgent() + ", " +
            "comment = " + getComment() + ", " +
            "likeNum = " + getLikeNum() + ", " +
            "order = " + getOrder() + ", " +
            "status = " + getStatus() + ")";
    }

    public Set<Comments> getChildrenComments() {
        return childrenComments;
    }

    public void setChildrenComments(
        Set<Comments> childrenComments) {
        this.childrenComments = childrenComments;
    }
}
