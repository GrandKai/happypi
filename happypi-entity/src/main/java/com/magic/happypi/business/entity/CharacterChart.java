package com.magic.happypi.business.entity;

public class CharacterChart {
    /**
     * 
     * chart_id
     */
    private String chartId;

    /**
     * 
     * chart_name
     */
    private String chartName;

    /**
     * 
     * customer_id
     */
    private String customerId;

    /**
     * 
     * activity_id
     */
    private String activityId;

    /**
     *
     * @mbg.generated
     */
    public CharacterChart(String chartId, String chartName, String customerId, String activityId) {
        this.chartId = chartId;
        this.chartName = chartName;
        this.customerId = customerId;
        this.activityId = activityId;
    }

    /**
     *
     * @mbg.generated
     */
    public CharacterChart() {
        super();
    }

    /**
     * 
     * @return chart_id 
     */
    public String getChartId() {
        return chartId;
    }

    /**
     * 
     * @param chartId 
     */
    public void setChartId(String chartId) {
        this.chartId = chartId == null ? null : chartId.trim();
    }

    /**
     * 
     * @return chart_name 
     */
    public String getChartName() {
        return chartName;
    }

    /**
     * 
     * @param chartName 
     */
    public void setChartName(String chartName) {
        this.chartName = chartName == null ? null : chartName.trim();
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
}