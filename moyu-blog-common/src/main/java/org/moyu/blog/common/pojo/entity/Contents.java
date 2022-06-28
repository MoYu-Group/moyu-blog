package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import org.moyu.blog.common.constant.ContentsStatus;
import org.moyu.blog.common.constant.ContentsType;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/

@Entity
@Table
public class Contents extends BaseEntity {

    private Long userId;
    private String title;
    private String shortName;
    @Lob
    private String content;
    private String cover;
    @Column(name = "`order`")
    private Integer order;
    private String template;
    private ContentsType type;
    private ContentsStatus status;
    private String password;
    private Long commentsNum;
    private Long likeNUm;
    private Boolean allowComment = Boolean.FALSE;
    private Boolean allowFeed = Boolean.FALSE;

    public Contents() {
    }

    public Contents(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, Long userId, String title, String shortName,
        String content, String cover, Integer order, String template, ContentsType type,
        ContentsStatus status, String password, Long commentsNum, Long likeNUm,
        Boolean allowComment,
        Boolean allowFeed) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.userId = userId;
        this.title = title;
        this.shortName = shortName;
        this.content = content;
        this.cover = cover;
        this.order = order;
        this.template = template;
        this.type = type;
        this.status = status;
        this.password = password;
        this.commentsNum = commentsNum;
        this.likeNUm = likeNUm;
        this.allowComment = allowComment;
        this.allowFeed = allowFeed;
    }

    public ContentsType getType() {
        return type;
    }

    public void setType(ContentsType type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }


    public ContentsStatus getStatus() {
        return status;
    }

    public void setStatus(ContentsStatus status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCommentsNum() {
        return commentsNum;
    }

    public void setCommentsNum(Long commentsNum) {
        this.commentsNum = commentsNum;
    }

    public Long getLikeNUm() {
        return likeNUm;
    }

    public void setLikeNUm(Long likeNUm) {
        this.likeNUm = likeNUm;
    }

    public Boolean getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(Boolean allowComment) {
        this.allowComment = allowComment;
    }

    public Boolean getAllowFeed() {
        return allowFeed;
    }

    public void setAllowFeed(Boolean allowFeed) {
        this.allowFeed = allowFeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Contents contents)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getUserId().equals(contents.getUserId()) && getTitle().equals(contents.getTitle())
            && getShortName().equals(contents.getShortName()) && getContent().equals(
            contents.getContent()) && getCover().equals(contents.getCover()) && getOrder().equals(
            contents.getOrder()) && getTemplate().equals(contents.getTemplate())
            && getType().equals(
            contents.getType()) && getStatus().equals(contents.getStatus()) && getPassword().equals(
            contents.getPassword()) && getCommentsNum().equals(contents.getCommentsNum())
            && getLikeNUm().equals(contents.getLikeNUm()) && getAllowComment().equals(
            contents.getAllowComment()) && getAllowFeed().equals(contents.getAllowFeed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUserId(), getTitle(), getShortName(), getContent(),
            getCover(), getOrder(), getTemplate(), getType(), getStatus(), getPassword(),
            getCommentsNum(), getLikeNUm(), getAllowComment(), getAllowFeed());
    }

    @Override
    public String toString() {
        return "Contents{" +
            "userId=" + userId +
            ", title='" + title + '\'' +
            ", shortName='" + shortName + '\'' +
            ", content='" + content + '\'' +
            ", cover='" + cover + '\'' +
            ", order=" + order +
            ", template='" + template + '\'' +
            ", type=" + type +
            ", status=" + status +
            ", password='" + password + '\'' +
            ", commentsNum=" + commentsNum +
            ", likeNUm=" + likeNUm +
            ", allowComment=" + allowComment +
            ", allowFeed=" + allowFeed +
            "} " + super.toString();
    }
}
