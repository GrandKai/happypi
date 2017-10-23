package com.magic.happypi.system.entity;

public class RoleMenuRela {
    /**
     * 
     * role_id
     */
    private String roleId;

    /**
     * 
     * menu_id
     */
    private String menuId;

    /**
     *
     * @mbg.generated
     */
    public RoleMenuRela(String roleId, String menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

    /**
     *
     * @mbg.generated
     */
    public RoleMenuRela() {
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
     * 
     * @return menu_id 
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 
     * @param menuId 
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }
}