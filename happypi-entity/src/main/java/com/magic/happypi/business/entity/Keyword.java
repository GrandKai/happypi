package com.magic.happypi.business.entity;

public class Keyword {
    /**
     * 
     * keyword_id
     */
    private String keywordId;

    /**
     * 关键字名称
     * keyword_name
     */
    private String keywordName;

    /**
     * 关键字分类
     * keyword_type
     */
    private String keywordType;

    /**
     *
     * @mbg.generated
     */
    public Keyword(String keywordId, String keywordName, String keywordType) {
        this.keywordId = keywordId;
        this.keywordName = keywordName;
        this.keywordType = keywordType;
    }

    /**
     *
     * @mbg.generated
     */
    public Keyword() {
        super();
    }

    /**
     * 
     * @return keyword_id 
     */
    public String getKeywordId() {
        return keywordId;
    }

    /**
     * 
     * @param keywordId 
     */
    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId == null ? null : keywordId.trim();
    }

    /**
     * 关键字名称
     * @return keyword_name 关键字名称
     */
    public String getKeywordName() {
        return keywordName;
    }

    /**
     * 关键字名称
     * @param keywordName 关键字名称
     */
    public void setKeywordName(String keywordName) {
        this.keywordName = keywordName == null ? null : keywordName.trim();
    }

    /**
     * 关键字分类
     * @return keyword_type 关键字分类
     */
    public String getKeywordType() {
        return keywordType;
    }

    /**
     * 关键字分类
     * @param keywordType 关键字分类
     */
    public void setKeywordType(String keywordType) {
        this.keywordType = keywordType == null ? null : keywordType.trim();
    }
}