package com.legend.base.entity;

import com.legend.base.model.pojo.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "base_order")
public class BaseOrder extends BaseEntity {
    /**
     * 订单发起用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 订单标题
     */
    private String title;

    /**
     * 订单描述
     */
    private String description;

    /**
     * 订单额外附加项
     */
    private String extra;

    /**
     * 是否开发票
     */
    @Column(name = "is_invoiced")
    private Boolean isInvoiced;

    /**
     * 支付类型
     */
    @Column(name = "payment_type")
    private Integer paymentType;

    /**
     * 订单金额
     */
    private BigDecimal amount;

    /**
     * 订单有效时间
     */
    @Column(name = "expire_time")
    private Date expireTime;

    /**
     * 状态（0、 1、）
     */
    private Integer status;

    /**
     * 订单内容
     */
    private String content;

    /**
     * 获取订单发起用户id
     *
     * @return user_id - 订单发起用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置订单发起用户id
     *
     * @param userId 订单发起用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取订单标题
     *
     * @return title - 订单标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置订单标题
     *
     * @param title 订单标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取订单描述
     *
     * @return description - 订单描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置订单描述
     *
     * @param description 订单描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取订单额外附加项
     *
     * @return extra - 订单额外附加项
     */
    public String getExtra() {
        return extra;
    }

    /**
     * 设置订单额外附加项
     *
     * @param extra 订单额外附加项
     */
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    /**
     * 获取是否开发票
     *
     * @return is_invoiced - 是否开发票
     */
    public Boolean getIsInvoiced() {
        return isInvoiced;
    }

    /**
     * 设置是否开发票
     *
     * @param isInvoiced 是否开发票
     */
    public void setIsInvoiced(Boolean isInvoiced) {
        this.isInvoiced = isInvoiced;
    }

    /**
     * 获取支付类型
     *
     * @return payment_type - 支付类型
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * 设置支付类型
     *
     * @param paymentType 支付类型
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取订单金额
     *
     * @return amount - 订单金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置订单金额
     *
     * @param amount 订单金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取订单有效时间
     *
     * @return expire_time - 订单有效时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置订单有效时间
     *
     * @param expireTime 订单有效时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取状态（0、 1、）
     *
     * @return status - 状态（0、 1、）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（0、 1、）
     *
     * @param status 状态（0、 1、）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取订单内容
     *
     * @return content - 订单内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置订单内容
     *
     * @param content 订单内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}