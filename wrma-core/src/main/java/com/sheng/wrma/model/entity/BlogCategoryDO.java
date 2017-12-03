package com.sheng.wrma.model.entity;

import java.util.Date;

public class BlogCategoryDO {
    private Integer id;

    private String categoryName;

    private Date createTime;

    private Date updateTime;

    private Date deleteTime;

    public BlogCategoryDO(Integer id, String categoryName, Date createTime, Date updateTime, Date deleteTime) {
        this.id = id;
        this.categoryName = categoryName;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteTime = deleteTime;
    }

    public BlogCategoryDO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}