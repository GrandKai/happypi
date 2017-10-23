package com.magic.happypi.business.entity;

import java.util.Date;

public class Picture {
    /**
     * 
     * picture_id
     */
    private String pictureId;

    /**
     * 
     * picture_name
     */
    private String pictureName;

    /**
     * 属于那个表的图片
     * table_name
     */
    private String tableName;

    /**
     * 所属表的记录ID
     * table_id
     */
    private String tableId;

    /**
     * 
     * picture_url
     */
    private String pictureUrl;

    /**
     * 
     * create_time
     */
    private Date createTime;

    /**
     *
     * @mbg.generated
     */
    public Picture(String pictureId, String pictureName, String tableName, String tableId, String pictureUrl, Date createTime) {
        this.pictureId = pictureId;
        this.pictureName = pictureName;
        this.tableName = tableName;
        this.tableId = tableId;
        this.pictureUrl = pictureUrl;
        this.createTime = createTime;
    }

    /**
     *
     * @mbg.generated
     */
    public Picture() {
        super();
    }

    /**
     * 
     * @return picture_id 
     */
    public String getPictureId() {
        return pictureId;
    }

    /**
     * 
     * @param pictureId 
     */
    public void setPictureId(String pictureId) {
        this.pictureId = pictureId == null ? null : pictureId.trim();
    }

    /**
     * 
     * @return picture_name 
     */
    public String getPictureName() {
        return pictureName;
    }

    /**
     * 
     * @param pictureName 
     */
    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    /**
     * 属于那个表的图片
     * @return table_name 属于那个表的图片
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 属于那个表的图片
     * @param tableName 属于那个表的图片
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * 所属表的记录ID
     * @return table_id 所属表的记录ID
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * 所属表的记录ID
     * @param tableId 所属表的记录ID
     */
    public void setTableId(String tableId) {
        this.tableId = tableId == null ? null : tableId.trim();
    }

    /**
     * 
     * @return picture_url 
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 
     * @param pictureUrl 
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
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