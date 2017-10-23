package com.magic.happypi.system.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class User {
    /**
     * 
     * user_id
     */
    @Id
    @GeneratedValue(generator = "UUID")
    private String userId;

    /**
     * 用户名称
     * user_name
     */
    private String userName;

    /**
     * 
     * real_name
     */
    private String realName;

    /**
     * 
     * nick_name
     */
    private String nickName;

    /**
     * 
     * password
     */
    private String password;

    /**
     * 是否有效
     * enabled
     */
    private String enabled;

    /**
     * 是否锁定
     * account_none_locked
     */
    private String accountNoneLocked;

    /**
     * 禁用原因
     * disabled_desc
     */
    private String disabledDesc;

    /**
     *
     * create_by
     */
    private String createBy;

    /**
     *
     * create_time
     */
    private Date createTime;

    /**
     *
     * update_by
     */
    private String updateBy;

    /**
     *
     * update_time
     */
    private Date updateTime;

    /**
     *
     * account_none_expired
     */
    private Long accountNoneExpired;

    /**
     *
     * credentials_none_expired
     */
    private Long credentialsNoneExpired;

    /**
     *
     * @mbg.generated
     */
    public User(String userId, String userName, String realName, String nickName, String password, String enabled, String accountNoneLocked, String disabledDesc, String createBy, Date createTime, String updateBy, Date updateTime, Long accountNoneExpired, Long credentialsNoneExpired) {
        this.userId = userId;
        this.userName = userName;
        this.realName = realName;
        this.nickName = nickName;
        this.password = password;
        this.enabled = enabled;
        this.accountNoneLocked = accountNoneLocked;
        this.disabledDesc = disabledDesc;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.accountNoneExpired = accountNoneExpired;
        this.credentialsNoneExpired = credentialsNoneExpired;
    }

    /**
     *
     * @mbg.generated
     */
    public User() {
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
     * 用户名称
     * @return user_name 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名称
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     *
     * @return real_name
     */
    public String getRealName() {
        return realName;
    }

    /**
     *
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     *
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 是否有效
     * @return enabled 是否有效
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * 是否有效
     * @param enabled 是否有效
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * 是否锁定
     * @return account_none_locked 是否锁定
     */
    public String getAccountNoneLocked() {
        return accountNoneLocked;
    }

    /**
     * 是否锁定
     * @param accountNoneLocked 是否锁定
     */
    public void setAccountNoneLocked(String accountNoneLocked) {
        this.accountNoneLocked = accountNoneLocked;
    }

    /**
     * 禁用原因
     * @return disabled_desc 禁用原因
     */
    public String getDisabledDesc() {
        return disabledDesc;
    }

    /**
     * 禁用原因
     * @param disabledDesc 禁用原因
     */
    public void setDisabledDesc(String disabledDesc) {
        this.disabledDesc = disabledDesc == null ? null : disabledDesc.trim();
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
     * @return account_none_expired
     */
    public Long getAccountNoneExpired() {
        return accountNoneExpired;
    }

    /**
     *
     * @param accountNoneExpired
     */
    public void setAccountNoneExpired(Long accountNoneExpired) {
        this.accountNoneExpired = accountNoneExpired;
    }

    /**
     *
     * @return credentials_none_expired
     */
    public Long getCredentialsNoneExpired() {
        return credentialsNoneExpired;
    }

    /**
     *
     * @param credentialsNoneExpired
     */
    public void setCredentialsNoneExpired(Long credentialsNoneExpired) {
        this.credentialsNoneExpired = credentialsNoneExpired;
    }

}