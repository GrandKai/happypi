package com.magic.happypi.system.entity;

public class UserRoleRela {
    /**
     * 
     * user_id
     */
    private String userId;

    /**
     * 
     * role_id
     */
    private String roleId;

    /**
     *
     * @mbg.generated
     */
    public UserRoleRela(String userId, String roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    /**
     *
     * @mbg.generated
     */
    public UserRoleRela() {
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
}