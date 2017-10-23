package com.magic.happypi.business.entity;

public class ActivityCustomer {
    /**
     * 
     * id
     */
    private String id;

    /**
     * 
     * activity_id
     */
    private String activityId;

    /**
     * 
     * customer_id
     */
    private String customerId;

    /**
     * 某个活动领队获取的点赞数量
     * thumbsup
     */
    private Integer thumbsup;

    /**
     * 领队对本次参加活动用户的评价
     * leader_commet
     */
    private String leaderCommet;

    /**
     *
     * @mbg.generated
     */
    public ActivityCustomer(String id, String activityId, String customerId, Integer thumbsup, String leaderCommet) {
        this.id = id;
        this.activityId = activityId;
        this.customerId = customerId;
        this.thumbsup = thumbsup;
        this.leaderCommet = leaderCommet;
    }

    /**
     *
     * @mbg.generated
     */
    public ActivityCustomer() {
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
     * 某个活动领队获取的点赞数量
     * @return thumbsup 某个活动领队获取的点赞数量
     */
    public Integer getThumbsup() {
        return thumbsup;
    }

    /**
     * 某个活动领队获取的点赞数量
     * @param thumbsup 某个活动领队获取的点赞数量
     */
    public void setThumbsup(Integer thumbsup) {
        this.thumbsup = thumbsup;
    }

    /**
     * 领队对本次参加活动用户的评价
     * @return leader_commet 领队对本次参加活动用户的评价
     */
    public String getLeaderCommet() {
        return leaderCommet;
    }

    /**
     * 领队对本次参加活动用户的评价
     * @param leaderCommet 领队对本次参加活动用户的评价
     */
    public void setLeaderCommet(String leaderCommet) {
        this.leaderCommet = leaderCommet == null ? null : leaderCommet.trim();
    }
}