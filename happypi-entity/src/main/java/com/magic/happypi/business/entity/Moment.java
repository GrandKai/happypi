package com.magic.happypi.business.entity;

import java.util.Date;

public class Moment {
    /**
     * 
     * moment_id
     */
    private String momentId;

    /**
     * 
     * customer_id
     */
    private String customerId;

    /**
     * 圈子内容
     * content
     */
    private String content;

    /**
     * 
     * create_time
     */
    private Date createTime;

    /**
     *
     * @mbg.generated
     */
    public Moment(String momentId, String customerId, String content, Date createTime) {
        this.momentId = momentId;
        this.customerId = customerId;
        this.content = content;
        this.createTime = createTime;
    }

    /**
     *
     * @mbg.generated
     */
    public Moment() {
        super();
    }

    /**
     * 
     * @return moment_id 
     */
    public String getMomentId() {
        return momentId;
    }

    /**
     * 
     * @param momentId 
     */
    public void setMomentId(String momentId) {
        this.momentId = momentId == null ? null : momentId.trim();
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
     * 圈子内容
     * @return content 圈子内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 圈子内容
     * @param content 圈子内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
}