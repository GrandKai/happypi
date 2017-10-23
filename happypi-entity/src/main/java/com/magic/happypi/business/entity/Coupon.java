package com.magic.happypi.business.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Coupon {
    /**
     * 
     * coupon_id
     */
    private String couponId;

    /**
     * 
     * coupon_name
     */
    private String couponName;

    /**
     * 优惠券描述
     * coupon_desc
     */
    private String couponDesc;

    /**
     * 优惠开始日期
     * valid_start_time
     */
    private Date validStartTime;

    /**
     * 优惠截止日期
     * valid_end_time
     */
    private Date validEndTime;

    /**
     * 优惠券创建时间
     * create_time
     */
    private String createTime;

    /**
     * 优惠券面额
     * denomination
     */
    private BigDecimal denomination;

    /**
     * 优惠券触发条件（满减）
     * condition
     */
    private BigDecimal condition;

    /**
     * 优惠券触发条件描述
     * condition_desc
     */
    private String conditionDesc;

    /**
     * 优惠券兑换所需积分
     * integration
     */
    private BigDecimal integration;

    /**
     *
     * @mbg.generated
     */
    public Coupon(String couponId, String couponName, String couponDesc, Date validStartTime, Date validEndTime, String createTime, BigDecimal denomination, BigDecimal condition, String conditionDesc, BigDecimal integration) {
        this.couponId = couponId;
        this.couponName = couponName;
        this.couponDesc = couponDesc;
        this.validStartTime = validStartTime;
        this.validEndTime = validEndTime;
        this.createTime = createTime;
        this.denomination = denomination;
        this.condition = condition;
        this.conditionDesc = conditionDesc;
        this.integration = integration;
    }

    /**
     *
     * @mbg.generated
     */
    public Coupon() {
        super();
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
     * 
     * @return coupon_name 
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * 
     * @param couponName 
     */
    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    /**
     * 优惠券描述
     * @return coupon_desc 优惠券描述
     */
    public String getCouponDesc() {
        return couponDesc;
    }

    /**
     * 优惠券描述
     * @param couponDesc 优惠券描述
     */
    public void setCouponDesc(String couponDesc) {
        this.couponDesc = couponDesc == null ? null : couponDesc.trim();
    }

    /**
     * 优惠开始日期
     * @return valid_start_time 优惠开始日期
     */
    public Date getValidStartTime() {
        return validStartTime;
    }

    /**
     * 优惠开始日期
     * @param validStartTime 优惠开始日期
     */
    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    /**
     * 优惠截止日期
     * @return valid_end_time 优惠截止日期
     */
    public Date getValidEndTime() {
        return validEndTime;
    }

    /**
     * 优惠截止日期
     * @param validEndTime 优惠截止日期
     */
    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }

    /**
     * 优惠券创建时间
     * @return create_time 优惠券创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 优惠券创建时间
     * @param createTime 优惠券创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * 优惠券面额
     * @return denomination 优惠券面额
     */
    public BigDecimal getDenomination() {
        return denomination;
    }

    /**
     * 优惠券面额
     * @param denomination 优惠券面额
     */
    public void setDenomination(BigDecimal denomination) {
        this.denomination = denomination;
    }

    /**
     * 优惠券触发条件（满减）
     * @return condition 优惠券触发条件（满减）
     */
    public BigDecimal getCondition() {
        return condition;
    }

    /**
     * 优惠券触发条件（满减）
     * @param condition 优惠券触发条件（满减）
     */
    public void setCondition(BigDecimal condition) {
        this.condition = condition;
    }

    /**
     * 优惠券触发条件描述
     * @return condition_desc 优惠券触发条件描述
     */
    public String getConditionDesc() {
        return conditionDesc;
    }

    /**
     * 优惠券触发条件描述
     * @param conditionDesc 优惠券触发条件描述
     */
    public void setConditionDesc(String conditionDesc) {
        this.conditionDesc = conditionDesc == null ? null : conditionDesc.trim();
    }

    /**
     * 优惠券兑换所需积分
     * @return integration 优惠券兑换所需积分
     */
    public BigDecimal getIntegration() {
        return integration;
    }

    /**
     * 优惠券兑换所需积分
     * @param integration 优惠券兑换所需积分
     */
    public void setIntegration(BigDecimal integration) {
        this.integration = integration;
    }
}