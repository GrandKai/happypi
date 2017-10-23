package com.magic.happypi.system.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class UserDetail {
    /**
     * 
     * user_id
     */
    @Id
    @GeneratedValue(generator = "UUID")
    private String userId;

    /**
     * 1：男，2：女
     * gender
     */
    private String gender;

    /**
     * 
     * mobile
     */
    private String mobile;

    /**
     * 
     * email
     */
    private String email;

    /**
     * 
     * wechat
     */
    private String wechat;

    /**
     * 
     * qq
     */
    private String qq;

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
    public UserDetail(String userId, String gender, String mobile, String email, String wechat, String qq, Date createTime, String createBy, Date updateTime, String updateBy) {
        this.userId = userId;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.wechat = wechat;
        this.qq = qq;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
    }

    /**
     *
     * @mbg.generated
     */
    public UserDetail() {
        super();
    }

    /**
     * 
     * @return user_id 
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 1：男，2：女
     * @return gender 1：男，2：女
     */
    public String getGender() {
        return gender;
    }

    /**
     * 1：男，2：女
     * @param gender 1：男，2：女
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 
     * @return mobile 
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile 
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 
     * @return email 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 
     * @return wechat 
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 
     * @param wechat 
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * 
     * @return qq 
     */
    public String getQq() {
        return qq;
    }

    /**
     * 
     * @param qq 
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
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