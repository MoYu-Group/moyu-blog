package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author fuhaixin
 * @date 2022/5/24
 **/
@Table
@Entity
public class User extends BaseEntity {

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 邮箱
     */
    private String mail;
    /**
     * 用户主页
     */
    private String url;
    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginTime;
    /**
     * 最后登录Ip
     */
    private String lastLoginIp;
    /**
     * 最后登录位置
     */
    private String ipLocation;

    public User() {
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
}
