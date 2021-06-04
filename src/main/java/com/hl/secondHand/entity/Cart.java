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
public class Cart extends Model<Cart> {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    private Integer gid;

    /**
     * 购买人id
     */
    private Integer sid;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 订单状态
     */
    private Integer state;

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
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        return "Cart{" +
            "id=" + id +
            ", gid=" + gid +
            ", sid=" + sid +
            ", remarks=" + remarks +
            ", state=" + state +
            ", createdDate=" + createdDate +
            ", lastModifiedDate=" + lastModifiedDate +
        "}";
    }
}
