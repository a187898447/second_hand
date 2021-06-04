package com.hl.secondHand.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hl
 * @since 2021-06-04
 */
public class SecondList extends Model<SecondList> {

    private static final long serialVersionUID = 1L;

    /**
     * 目录id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 一级目录id
     */
    private Integer fid;

    /**
     * 目录名
     */
    private String name;

    /**
     * 创建时间
     */
    private LocalDateTime createdDate;

    /**
     * 最后更新时间
     */
    private LocalDateTime lastModifiedDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SecondList{" +
            "id=" + id +
            ", fid=" + fid +
            ", name=" + name +
            ", createdDate=" + createdDate +
            ", lastModifiedDate=" + lastModifiedDate +
        "}";
    }
}
