package com.sheng.wrma.model.entity;

import java.util.Date;

public class BlogDO {
    private Integer id;

    private Integer categoryId;

    private Integer authorId;

    private Integer tagId;

    private String title;

    private Integer likeNum;

    private Integer commentNum;

    private Integer viewNum;

    private Date createTime;

    private Date updateTime;

    private Date deleteTime;

    public BlogDO(Integer id, Integer categoryId, Integer authorId, Integer tagId, String title, Integer likeNum, Integer commentNum, Integer viewNum, Date createTime, Date updateTime, Date deleteTime) {
        this.id = id;
        this.categoryId = categoryId;
        this.authorId = authorId;
        this.tagId = tagId;
        this.title = title;
        this.likeNum = likeNum;
        this.commentNum = commentNum;
        this.viewNum = viewNum;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteTime = deleteTime;
    }

    public BlogDO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getViewNum() {
        return viewNum;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
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