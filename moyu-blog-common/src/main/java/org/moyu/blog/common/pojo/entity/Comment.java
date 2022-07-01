package org.moyu.blog.common.pojo.entity;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "create_by", nullable = false, length = 128)
    private String createBy;

    @Column(name = "update_by", nullable = false, length = 128)
    private String updateBy;

    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @Column(name = "is_deleted", nullable = false)
    private Integer isDeleted;

    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    @Column(name = "content_id", nullable = false)
    private Long contentId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "user_name", nullable = false, length = 64)
    private String userName;

    @Column(name = "mail", nullable = false)
    private String mail;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "ip", nullable = false, length = 64)
    private String ip;

    @Column(name = "ip_location", nullable = false, length = 64)
    private String ipLocation;

    @Column(name = "agent", nullable = false)
    private String agent;

    @Lob
    @Column(name = "comment", nullable = false)
    private String comment;

    @Column(name = "like_num", nullable = false)
    private Integer likeNum;

    @Column(name = "`order`", nullable = false)
    private Integer order;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "parent_id", nullable = false)
    private Long parentId;

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

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

}