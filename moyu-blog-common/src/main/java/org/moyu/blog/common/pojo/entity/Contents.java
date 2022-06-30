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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.moyu.blog.common.constant.ContentsStatus;
import org.moyu.blog.common.constant.ContentsType;

/**
 * @author fuhaixin
 * @date 2022/6/28
 */
@Entity
@Table
public class Contents extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "user_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
  private User user;

  @Basic(optional = false)
  private String title;

  @Basic(optional = false)
  private String shortName;

  @Basic(optional = false)
  @Lob
  private String content;

  @Basic(optional = false)
  private String cover;

  @Basic(optional = false)
  @Column(name = "`order`")
  private Integer order;

  @Basic(optional = false)
  private String template;

  @Basic(optional = false)
  private ContentsType type;

  @Basic(optional = false)
  private ContentsStatus status;

  @Basic(optional = false)
  private String password;

  @Basic(optional = false)
  private Long commentsNum;

  @Basic(optional = false)
  private Long likeNUm;

  @Basic(optional = false)
  private Boolean allowComment = Boolean.FALSE;

  @Basic(optional = false)
  private Boolean allowFeed = Boolean.FALSE;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "contents")
  private Set<TagContentsRelationShip> tagContentsRelationShipSet = new HashSet<>();

  @OneToMany(mappedBy = "contents", fetch = FetchType.LAZY)
  private Set<Comments> commentsSet = new HashSet<>();

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "contents")
  private Set<FileContentsRelationShip> fileContentsRelationShipSet = new HashSet<>();

  public Contents() {}

  public Contents(
      Long id,
      String createBy,
      String updateBy,
      LocalDateTime createTime,
      LocalDateTime updateTime,
      Boolean isDeleted,
      User user,
      String title,
      String shortName,
      String content,
      String cover,
      Integer order,
      String template,
      ContentsType type,
      ContentsStatus status,
      String password,
      Long commentsNum,
      Long likeNUm,
      Boolean allowComment,
      Boolean allowFeed,
      Set<TagContentsRelationShip> tagContentsRelationShipSet,
      Set<Comments> commentsSet,
      Set<FileContentsRelationShip> fileContentsRelationShipSet) {
    super(id, createBy, updateBy, createTime, updateTime, isDeleted);
    this.user = user;
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
    this.tagContentsRelationShipSet = tagContentsRelationShipSet;
    this.commentsSet = commentsSet;
    this.fileContentsRelationShipSet = fileContentsRelationShipSet;
  }

  public Set<TagContentsRelationShip> getTagContentsRelationShipSet() {
    return tagContentsRelationShipSet;
  }

  public void setTagContentsRelationShipSet(
      Set<TagContentsRelationShip> tagContentsRelationShipSet) {
    this.tagContentsRelationShipSet = tagContentsRelationShipSet;
  }

  public Set<FileContentsRelationShip> getFileContentsRelationShipSet() {
    return fileContentsRelationShipSet;
  }

  public void setFileContentsRelationShipSet(
      Set<FileContentsRelationShip> fileContentsRelationShipSet) {
    this.fileContentsRelationShipSet = fileContentsRelationShipSet;
  }

  @Override
  public String toString() {
    return "Contents{"
        + "user="
        + user
        + ", title='"
        + title
        + '\''
        + ", shortName='"
        + shortName
        + '\''
        + ", content='"
        + content
        + '\''
        + ", cover='"
        + cover
        + '\''
        + ", order="
        + order
        + ", template='"
        + template
        + '\''
        + ", type="
        + type
        + ", status="
        + status
        + ", password='"
        + password
        + '\''
        + ", commentsNum="
        + commentsNum
        + ", likeNUm="
        + likeNUm
        + ", allowComment="
        + allowComment
        + ", allowFeed="
        + allowFeed
        + ", tagContentsRelationShipSet="
        + tagContentsRelationShipSet
        + ", commentsSet="
        + commentsSet
        + ", fileContentsRelationShipSet="
        + fileContentsRelationShipSet
        + "} "
        + super.toString();
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
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

  public ContentsType getType() {
    return type;
  }

  public void setType(ContentsType type) {
    this.type = type;
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

  public Set<Comments> getCommentsSet() {
    return commentsSet;
  }

  public void setCommentsSet(Set<Comments> commentsSet) {
    this.commentsSet = commentsSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Contents)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Contents contents = (Contents) o;
    return getUser().equals(contents.getUser())
        && getTitle().equals(contents.getTitle())
        && getShortName().equals(contents.getShortName())
        && getContent().equals(contents.getContent())
        && getCover().equals(contents.getCover())
        && getOrder().equals(contents.getOrder())
        && getTemplate().equals(contents.getTemplate())
        && getType() == contents.getType()
        && getStatus() == contents.getStatus()
        && getPassword().equals(contents.getPassword())
        && getCommentsNum().equals(contents.getCommentsNum())
        && getLikeNUm().equals(contents.getLikeNUm())
        && getAllowComment().equals(contents.getAllowComment())
        && getAllowFeed().equals(contents.getAllowFeed())
        && getTagContentsRelationShipSet().equals(contents.getTagContentsRelationShipSet())
        && getCommentsSet().equals(contents.getCommentsSet())
        && getFileContentsRelationShipSet().equals(contents.getFileContentsRelationShipSet());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(),
        getUser(),
        getTitle(),
        getShortName(),
        getContent(),
        getCover(),
        getOrder(),
        getTemplate(),
        getType(),
        getStatus(),
        getPassword(),
        getCommentsNum(),
        getLikeNUm(),
        getAllowComment(),
        getAllowFeed(),
        getTagContentsRelationShipSet(),
        getCommentsSet(),
        getFileContentsRelationShipSet());
  }
}
