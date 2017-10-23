package com.magic.happypi.business.entity;

import java.math.BigDecimal;
import java.util.Date;

public class IntegrationRules {
    /**
     * 
     * integration_id
     */
    private String integrationId;

    /**
     * 积分名称
     * integration_name
     */
    private String integrationName;

    /**
     * 积分分数
     * integration
     */
    private BigDecimal integration;

    /**
     * 积分行为
     * integration_behavior
     */
    private String integrationBehavior;

    /**
     * 
     * create_time
     */
    private Date createTime;

    /**
     * 
     * create_by
     */
    private String createBy;

    /**
     * 
     * update_time
     */
    private Date updateTime;

    /**
     * 
     * update_by
     */
    private String updateBy;

    /**
     *
     * @mbg.generated
     */
    public IntegrationRules(String integrationId, String integrationName, BigDecimal integration, String integrationBehavior, Date createTime, String createBy, Date updateTime, String updateBy) {
        this.integrationId = integrationId;
        this.integrationName = integrationName;
        this.integration = integration;
        this.integrationBehavior = integrationBehavior;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
    }

    /**
     *
     * @mbg.generated
     */
    public IntegrationRules() {
        super();
    }

    /**
     * 
     * @return integration_id 
     */
    public String getIntegrationId() {
        return integrationId;
    }

    /**
     * 
     * @param integrationId 
     */
    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId == null ? null : integrationId.trim();
    }

    /**
     * 积分名称
     * @return integration_name 积分名称
     */
    public String getIntegrationName() {
        return integrationName;
    }

    /**
     * 积分名称
     * @param integrationName 积分名称
     */
    public void setIntegrationName(String integrationName) {
        this.integrationName = integrationName == null ? null : integrationName.trim();
    }

    /**
     * 积分分数
     * @return integration 积分分数
     */
    public BigDecimal getIntegration() {
        return integration;
    }

    /**
     * 积分分数
     * @param integration 积分分数
     */
    public void setIntegration(BigDecimal integration) {
        this.integration = integration;
    }

    /**
     * 积分行为
     * @return integration_behavior 积分行为
     */
    public String getIntegrationBehavior() {
        return integrationBehavior;
    }

    /**
     * 积分行为
     * @param integrationBehavior 积分行为
     */
    public void setIntegrationBehavior(String integrationBehavior) {
        this.integrationBehavior = integrationBehavior == null ? null : integrationBehavior.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return create_by 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 
     * @return update_by 
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 
     * @param updateBy 
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}