package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.moyu.blog.common.constant.CommentStatus;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/

@Table
@Entity
public class Comments extends BaseEntity {

    private Long ownerId;
    private Long contentId;
    private Long userId;
    private String userName;
    private String url;
    private String ip;
    private String ipLocation;
    private String agent;
    private String comment;
    private Long likeNum;
    private Integer order;
    private CommentStatus status;

    public Comments() {
    }


    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
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
        if (!(o instanceof Comments)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Comments comments = (Comments) o;
        return getOwnerId().equals(comments.getOwnerId()) && getContentId().equals(
            comments.getContentId()) && getUserId().equals(comments.getUserId())
            && getUserName().equals(comments.getUserName()) && getUrl().equals(comments.getUrl())
            && getIp().equals(comments.getIp()) && getIpLocation().equals(comments.getIpLocation())
            && getAgent().equals(comments.getAgent()) && getComment().equals(comments.getComment())
            && getLikeNum().equals(comments.getLikeNum()) && getOrder().equals(comments.getOrder())
            && getStatus() == comments.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOwnerId(), getContentId(), getUserId(),
            getUserName(),
            getUrl(), getIp(), getIpLocation(), getAgent(), getComment(), getLikeNum(), getOrder(),
            getStatus());
    }

    public Comments(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, Long ownerId, Long contentId,
        Long userId, String userName, String url, String ip, String ipLocation, String agent,
        String comment, Long likeNum, Integer order, CommentStatus status) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.ownerId = ownerId;
        this.contentId = contentId;
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
}
