package com.magic.happypi.system.entity;

import javax.persistence.Id;

public class Menu {
    /**
     * 
     * menu_id
     */
    @Id
    private String menuId;

    /**
     * 菜单名称
     * menu_name
     */
    private String menuName;

    /**
     * 菜单路径
     * menu_url
     */
    private String menuUrl;

    /**
     * 图标，可以存bootstrap或fa的class类名
     * menu_image
     */
    private String menuImage;

    /**
     * 菜单类型
     * menu_type
     */
    private String menuType;

    /**
     * 
     * order_num
     */
    private Short orderNum;

    /**
     * 是否叶子节点
     * is_leaf
     */
    private String isLeaf;

    /**
     * 父节点id
     * parent_id
     */
    private String parentId;

    /**
     *
     * @mbg.generated
     */
    public Menu(String menuId, String menuName, String menuUrl, String menuImage, String menuType, Short orderNum, String isLeaf, String parentId) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuImage = menuImage;
        this.menuType = menuType;
        this.orderNum = orderNum;
        this.isLeaf = isLeaf;
        this.parentId = parentId;
    }

    /**
     *
     * @mbg.generated
     */
    public Menu() {
        super();
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

    /**
     * 菜单名称
     * @return menu_name 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 菜单路径
     * @return menu_url 菜单路径
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 菜单路径
     * @param menuUrl 菜单路径
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * 图标，可以存bootstrap或fa的class类名
     * @return menu_image 图标，可以存bootstrap或fa的class类名
     */
    public String getMenuImage() {
        return menuImage;
    }

    /**
     * 图标，可以存bootstrap或fa的class类名
     * @param menuImage 图标，可以存bootstrap或fa的class类名
     */
    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage == null ? null : menuImage.trim();
    }

    /**
     * 菜单类型
     * @return menu_type 菜单类型
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * 菜单类型
     * @param menuType 菜单类型
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    /**
     * 
     * @return order_num 
     */
    public Short getOrderNum() {
        return orderNum;
    }

    /**
     * 
     * @param orderNum 
     */
    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 是否叶子节点
     * @return is_leaf 是否叶子节点
     */
    public String getIsLeaf() {
        return isLeaf;
    }

    /**
     * 是否叶子节点
     * @param isLeaf 是否叶子节点
     */
    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf == null ? null : isLeaf.trim();
    }

    /**
     * 父节点id
     * @return parent_id 父节点id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 父节点id
     * @param parentId 父节点id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }
}