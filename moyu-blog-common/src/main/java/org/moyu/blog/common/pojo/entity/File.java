package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.moyu.blog.common.constant.FileSaveType;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
@Entity
@Table
public class File extends BaseEntity {
    @Basic(optional = false)

    private Long contentId;
    @Basic(optional = false)

    private Long userId;
    @Basic(optional = false)

    private String name;
    @Basic(optional = false)

    private String path;
    @Basic(optional = false)

    private Integer size;
    @Basic(optional = false)

    private FileSaveType saveType;

    private String type;
    private String mimeType;

    public File() {
    }

    public File(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted, Long contentId, Long userId, String name,
        String path, Integer size, FileSaveType saveType, String type, String mimeType) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.contentId = contentId;
        this.userId = userId;
        this.name = name;
        this.path = path;
        this.size = size;
        this.saveType = saveType;
        this.type = type;
        this.mimeType = mimeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof File file)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getContentId().equals(file.getContentId()) && getUserId().equals(file.getUserId())
            && getName().equals(file.getName()) && getPath().equals(file.getPath())
            && getSize().equals(
            file.getSize()) && getSaveType() == file.getSaveType() && getType().equals(
            file.getType())
            && getMimeType().equals(file.getMimeType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getContentId(), getUserId(), getName(), getPath(),
            getSize(), getSaveType(), getType(), getMimeType());
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public FileSaveType getSaveType() {
        return saveType;
    }

    public void setSaveType(FileSaveType saveType) {
        this.saveType = saveType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @Override
    public String toString() {
        return "File{" +
            "contentId=" + contentId +
            ", userId=" + userId +
            ", name='" + name + '\'' +
            ", path='" + path + '\'' +
            ", size=" + size +
            ", saveType=" + saveType +
            ", type='" + type + '\'' +
            ", mimeType='" + mimeType + '\'' +
            "} " + super.toString();
    }
}
