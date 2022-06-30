package org.moyu.blog.common.pojo.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author fuhaixin
 * @date 2022/6/30
 **/
@Entity
@Table(name = "relation_ship")
public class FileContentsRelationShip implements Serializable {

    public FileContentsRelationShip() {
    }

    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "snowflake_generator"
    )
    @GenericGenerator(
        name = "snowflake_generator",
        strategy = "org.moyu.blog.common.jpa.id.SnowflakeIdGenerator"
    )
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rel_id1", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Contents contents;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rel_id2", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private File file;

    public FileContentsRelationShip(Long id, Contents contents, File file) {
        this.id = id;
        this.contents = contents;
        this.file = file;
    }

    @Override
    public String toString() {
        return "FileContentsRelationShip{" +
            "id=" + id +
            ", contents=" + contents +
            ", file=" + file +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileContentsRelationShip that)) {
            return false;
        }
        return getId().equals(that.getId()) && getContents().equals(that.getContents())
            && getFile().equals(that.getFile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContents(), getFile());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contents getContents() {
        return contents;
    }

    public void setContents(Contents contents) {
        this.contents = contents;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
