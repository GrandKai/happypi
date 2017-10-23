package com.magic.happypi.system.entity;

import javax.persistence.Id;
import java.util.Date;

public class Role {
    /**
     * 
     * role_id
     */
    @Id
    private String roleId;

    /**
     * 角色名称
     * role_name
     */
    private String roleName;

    /**
     * 角色描述
     * role_desc
     */
    private String roleDesc;

    /**
     * 状态
     * status
     */
    private String status;

    /**
     * 角色类型
     * role_type
     */
    private String roleType;

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
    public Role(String roleId, String roleName, String roleDesc, String status, String roleType, Date createTime, String createBy, Date updateTime, String updateBy) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.status = status;
        this.roleType = roleType;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
    }

    /**
     *
     * @mbg.generated
     */
    public Role() {
        super();
    }

    /**
     * 
     * @return role_id 
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 角色名称
     * @return role_name 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 角色描述
     * @return role_desc 角色描述
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * 角色描述
     * @param roleDesc 角色描述
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 角色类型
     * @return role_type 角色类型
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * 角色类型
     * @param roleType 角色类型
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
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