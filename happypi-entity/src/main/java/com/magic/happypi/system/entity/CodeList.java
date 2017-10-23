package com.magic.happypi.system.entity;

import javax.persistence.Id;

public class CodeList {
    /**
     * 
     * id
     */
    @Id
    private String id;

    /**
     * 类型名称
     * kind_name
     */
    private String kindName;

    /**
     * 类型代码
     * kind_value
     */
    private String kindValue;

    /**
     * 代码名称
     * code_name
     */
    private String codeName;

    /**
     * 代码值
     * code_value
     */
    private String codeValue;

    /**
     * 序号
     * order_num
     */
    private Short orderNum;

    /**
     * 备注
     * remark
     */
    private String remark;

    /**
     *
     * @mbg.generated
     */
    public CodeList(String id, String kindName, String kindValue, String codeName, String codeValue, Short orderNum, String remark) {
        this.id = id;
        this.kindName = kindName;
        this.kindValue = kindValue;
        this.codeName = codeName;
        this.codeValue = codeValue;
        this.orderNum = orderNum;
        this.remark = remark;
    }

    /**
     *
     * @mbg.generated
     */
    public CodeList() {
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
     * 类型名称
     * @return kind_name 类型名称
     */
    public String getKindName() {
        return kindName;
    }

    /**
     * 类型名称
     * @param kindName 类型名称
     */
    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    /**
     * 类型代码
     * @return kind_value 类型代码
     */
    public String getKindValue() {
        return kindValue;
    }

    /**
     * 类型代码
     * @param kindValue 类型代码
     */
    public void setKindValue(String kindValue) {
        this.kindValue = kindValue == null ? null : kindValue.trim();
    }

    /**
     * 代码名称
     * @return code_name 代码名称
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * 代码名称
     * @param codeName 代码名称
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName == null ? null : codeName.trim();
    }

    /**
     * 代码值
     * @return code_value 代码值
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * 代码值
     * @param codeValue 代码值
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    /**
     * 序号
     * @return order_num 序号
     */
    public Short getOrderNum() {
        return orderNum;
    }

    /**
     * 序号
     * @param orderNum 序号
     */
    public void setOrderNum(Short orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}