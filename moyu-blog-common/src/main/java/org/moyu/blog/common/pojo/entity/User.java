package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author fuhaixin
 * @date 2022/5/24
 **/
@Table
@Entity
public class User extends BaseEntity {

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<File> fileSet = new HashSet<>();
    /**
     * 用户名
     */
    @Basic(optional = false)
    private String username;
    /**
     * 密码
     */
    @Basic(optional = false)
    private String password;
    /**
     * 昵称
     */
    @Basic(optional = false)
    private String nickname;
    /**
     * 邮箱
     */
    @Basic(optional = false)
    private String mail;
    /**
     * 用户主页
     */
    @Basic(optional = false)
    private String url;
    /**
     * 最后登录时间
     */
    @Basic(optional = false)
    private LocalDateTime lastLoginTime;
    /**
     * 最后登录Ip
     */
    @Basic(optional = false)
    private String lastLoginIp;
    /**
     * 最后登录位置
     */
    @Basic(optional = false)
    private String ipLocation;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Contents> contentsSet = new HashSet<>();
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Options> optionsSet = new HashSet<>();
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Tag> tagSet = new HashSet<>();
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Category> categorySet = new HashSet<>();

    public User() {
    }

    public User(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, String username, String password,
        String nickname,
        String mail, String url, LocalDateTime lastLoginTime, String lastLoginIp,
        String ipLocation) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.mail = mail;
        this.url = url;
        this.lastLoginTime = lastLoginTime;
        this.lastLoginIp = lastLoginIp;
        this.ipLocation = ipLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User user)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getUsername().equals(user.getUsername()) && getPassword().equals(user.getPassword())
            && getNickname().equals(user.getNickname()) && getMail().equals(user.getMail())
            && getUrl().equals(user.getUrl()) && getLastLoginTime().equals(user.getLastLoginTime())
            && getLastLoginIp().equals(user.getLastLoginIp()) && getIpLocation().equals(
            user.getIpLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUsername(), getPassword(), getNickname(),
            getMail(),
            getUrl(), getLastLoginTime(), getLastLoginIp(), getIpLocation());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public String getIpLocation() {
        return ipLocation;
    }

    public void setIpLocation(String ipLocation) {
        this.ipLocation = ipLocation;
    }

    public Set<File> getFileSet() {
        return fileSet;
    }

    public void setFileSet(Set<File> fileSet) {
        this.fileSet = fileSet;
    }

    public Set<Contents> getContentsSet() {
        return contentsSet;
    }

    public void setContentsSet(Set<Contents> contentsSet) {
        this.contentsSet = contentsSet;
    }

    public Set<Options> getOptionsSet() {
        return optionsSet;
    }

    public void setOptionsSet(Set<Options> optionsSet) {
        this.optionsSet = optionsSet;
    }

    public Set<Tag> getTagSet() {
        return tagSet;
    }

    public void setTagSet(Set<Tag> tagSet) {
        this.tagSet = tagSet;
    }

    public Set<Category> getCategorySet() {
        return categorySet;
    }

    public void setCategorySet(Set<Category> categorySet) {
        this.categorySet = categorySet;
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
            "username = " + getUsername() + ", " +
            "password = " + getPassword() + ", " +
            "nickname = " + getNickname() + ", " +
            "mail = " + getMail() + ", " +
            "url = " + getUrl() + ", " +
            "lastLoginTime = " + getLastLoginTime() + ", " +
            "lastLoginIp = " + getLastLoginIp() + ", " +
            "ipLocation = " + getIpLocation() + ")";
    }
}
