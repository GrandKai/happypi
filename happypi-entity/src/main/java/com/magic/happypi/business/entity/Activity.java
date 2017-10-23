package com.magic.happypi.business.entity;

import java.util.Date;

public class Activity {
    /**
     * 
     * activity_id
     */
    private String activityId;

    /**
     * 活动名称
     * activity_name
     */
    private String activityName;

    /**
     * 活动开始时间
     * start_time
     */
    private Date startTime;

    /**
     * 活动结束时间
     * end_time
     */
    private Date endTime;

    /**
     * 点赞数量
     * thumbsup_count
     */
    private Integer thumbsupCount;

    /**
     * 活动创建时间
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
    public Activity(String activityId, String activityName, Date startTime, Date endTime, Integer thumbsupCount, Date createTime, String createBy, Date updateTime, String updateBy) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.thumbsupCount = thumbsupCount;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
    }

    /**
     *
     * @mbg.generated
     */
    public Activity() {
        super();
    }

    /**
     * 
     * @return activity_id 
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * 
     * @param activityId 
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    /**
     * 活动名称
     * @return activity_name 活动名称
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * 活动名称
     * @param activityName 活动名称
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    /**
     * 活动开始时间
     * @return start_time 活动开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 活动开始时间
     * @param startTime 活动开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 活动结束时间
     * @return end_time 活动结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 活动结束时间
     * @param endTime 活动结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 点赞数量
     * @return thumbsup_count 点赞数量
     */
    public Integer getThumbsupCount() {
        return thumbsupCount;
    }

    /**
     * 点赞数量
     * @param thumbsupCount 点赞数量
     */
    public void setThumbsupCount(Integer thumbsupCount) {
        this.thumbsupCount = thumbsupCount;
    }

    /**
     * 活动创建时间
     * @return create_time 活动创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 活动创建时间
     * @param createTime 活动创建时间
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