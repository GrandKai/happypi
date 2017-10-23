package com.magic.happypi.business.entity;

import java.util.Date;

public class CustomerCoupon {
    /**
     * 
     * id
     */
    private String id;

    /**
     * 
     * customer_id
     */
    private String customerId;

    /**
     * 
     * coupon_id
     */
    private String couponId;

    /**
     * 优惠券获取时间
     * create_time
     */
    private Date createTime;

    /**
     * 优惠券是否使用：1：未使用，0：使用 如果：未使用，优惠券过期不修改状态
     * status
     */
    private String status;

    /**
     *
     * @mbg.generated
     */
    public CustomerCoupon(String id, String customerId, String couponId, Date createTime, String status) {
        this.id = id;
        this.customerId = customerId;
        this.couponId = couponId;
        this.createTime = createTime;
        this.status = status;
    }

    /**
     *
     * @mbg.generated
     */
    public CustomerCoupon() {
        super();
    }

    /**
     * 
     * @return id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 
     * @return customer_id 
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 
     * @param customerId 
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    /**
     * 
     * @return coupon_id 
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 
     * @param couponId 
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    /**
     * 优惠券获取时间
     * @return create_time 优惠券获取时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 优惠券获取时间
     * @param createTime 优惠券获取时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 优惠券是否使用：1：未使用，0：使用 如果：未使用，优惠券过期不修改状态
     * @return status 优惠券是否使用：1：未使用，0：使用 如果：未使用，优惠券过期不修改状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 优惠券是否使用：1：未使用，0：使用 如果：未使用，优惠券过期不修改状态
     * @param status 优惠券是否使用：1：未使用，0：使用 如果：未使用，优惠券过期不修改状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}