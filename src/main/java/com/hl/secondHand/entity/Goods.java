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
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 二级目录id
     */
    private Integer sid;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 商品名
     */
    private String name;

    /**
     * 商品描述
     */
    private String describe;

    /**
     * 商品单价
     */
    private Double amount;

    /**
     * 商品状态
     */
    private Integer state;

    /**
     * 商品热度
     */
    private Integer purchase;

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
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    public Integer getPurchase() {
        return purchase;
    }

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
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
        return "Goods{" +
            "id=" + id +
            ", sid=" + sid +
            ", uid=" + uid +
            ", name=" + name +
            ", describe=" + describe +
            ", amount=" + amount +
            ", state=" + state +
            ", purchase=" + purchase +
            ", createdDate=" + createdDate +
            ", lastModifiedDate=" + lastModifiedDate +
        "}";
    }
}
