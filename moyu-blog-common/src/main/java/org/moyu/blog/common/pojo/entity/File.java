package org.moyu.blog.common.pojo.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.moyu.blog.common.constant.FileSaveType;

/**
 * @author fuhaixin
 * @date 2022/6/28
 **/
@Entity
@Table
public class File extends BaseEntity {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "file")
    private Set<FileContentsRelationShip> fileContentsRelationShipSet = new HashSet<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private User user;
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

    public File(Set<FileContentsRelationShip> fileContentsRelationShipSet, User user, String name,
        String path, Integer size, FileSaveType saveType, String type, String mimeType) {
        this.fileContentsRelationShipSet = fileContentsRelationShipSet;
        this.user = user;
        this.name = name;
        this.path = path;
        this.size = size;
        this.saveType = saveType;
        this.type = type;
        this.mimeType = mimeType;
    }

    public File(Long id, String createBy, String updateBy, LocalDateTime createTime,
        LocalDateTime updateTime, Boolean isDeleted,
        Set<FileContentsRelationShip> fileContentsRelationShipSet, User user, String name,
        String path,
        Integer size, FileSaveType saveType, String type, String mimeType) {
        super(id, createBy, updateBy, createTime, updateTime, isDeleted);
        this.fileContentsRelationShipSet = fileContentsRelationShipSet;
        this.user = user;
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
        if (!(o instanceof File)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        File file = (File) o;
        return getFileContentsRelationShipSet().equals(file.getFileContentsRelationShipSet())
            && getUser().equals(file.getUser()) && getName().equals(file.getName())
            && getPath().equals(
            file.getPath()) && getSize().equals(file.getSize())
            && getSaveType() == file.getSaveType()
            && getType().equals(file.getType()) && getMimeType().equals(file.getMimeType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFileContentsRelationShipSet(), getUser(),
            getName(),
            getPath(), getSize(), getSaveType(), getType(), getMimeType());
    }

    public Set<FileContentsRelationShip> getFileContentsRelationShipSet() {
        return fileContentsRelationShipSet;
    }

    public void setFileContentsRelationShipSet(
        Set<FileContentsRelationShip> fileContentsRelationShipSet) {
        this.fileContentsRelationShipSet = fileContentsRelationShipSet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
            "fileContentsRelationShipSet=" + fileContentsRelationShipSet +
            ", user=" + user +
            ", name='" + name + '\'' +
            ", path='" + path + '\'' +
            ", size=" + size +
            ", saveType=" + saveType +
            ", type='" + type + '\'' +
            ", mimeType='" + mimeType + '\'' +
            "} " + super.toString();
    }
}
