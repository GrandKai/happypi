package com.magic.happypi.business.entity;

import java.math.BigDecimal;

public class CustomerBehavior {
    /**
     * 
     * behavior_id
     */
    private String behaviorId;

    /**
     * 1：参加活动，2：打赏，3：兑换商品，4：兑换优惠券，5：充值等等
     * behavior_type
     */
    private String behaviorType;

    /**
     * 
     * integration
     */
    private BigDecimal integration;

    /**
     * 行为描述
     * behavior_desc
     */
    private String behaviorDesc;

    /**
     * 创建时间
     * create_time
     */
    private String createTime;

    /**
     * 
     * customer_id
     */
    private String customerId;

    /**
     *
     * @mbg.generated
     */
    public CustomerBehavior(String behaviorId, String behaviorType, BigDecimal integration, String behaviorDesc, String createTime, String customerId) {
        this.behaviorId = behaviorId;
        this.behaviorType = behaviorType;
        this.integration = integration;
        this.behaviorDesc = behaviorDesc;
        this.createTime = createTime;
        this.customerId = customerId;
    }

    /**
     *
     * @mbg.generated
     */
    public CustomerBehavior() {
        super();
    }

    /**
     * 
     * @return behavior_id 
     */
    public String getBehaviorId() {
        return behaviorId;
    }

    /**
     * 
     * @param behaviorId 
     */
    public void setBehaviorId(String behaviorId) {
        this.behaviorId = behaviorId == null ? null : behaviorId.trim();
    }

    /**
     * 1：参加活动，2：打赏，3：兑换商品，4：兑换优惠券，5：充值等等
     * @return behavior_type 1：参加活动，2：打赏，3：兑换商品，4：兑换优惠券，5：充值等等
     */
    public String getBehaviorType() {
        return behaviorType;
    }

    /**
     * 1：参加活动，2：打赏，3：兑换商品，4：兑换优惠券，5：充值等等
     * @param behaviorType 1：参加活动，2：打赏，3：兑换商品，4：兑换优惠券，5：充值等等
     */
    public void setBehaviorType(String behaviorType) {
        this.behaviorType = behaviorType == null ? null : behaviorType.trim();
    }

    /**
     * 
     * @return integration 
     */
    public BigDecimal getIntegration() {
        return integration;
    }

    /**
     * 
     * @param integration 
     */
    public void setIntegration(BigDecimal integration) {
        this.integration = integration;
    }

    /**
     * 行为描述
     * @return behavior_desc 行为描述
     */
    public String getBehaviorDesc() {
        return behaviorDesc;
    }

    /**
     * 行为描述
     * @param behaviorDesc 行为描述
     */
    public void setBehaviorDesc(String behaviorDesc) {
        this.behaviorDesc = behaviorDesc == null ? null : behaviorDesc.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
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
}