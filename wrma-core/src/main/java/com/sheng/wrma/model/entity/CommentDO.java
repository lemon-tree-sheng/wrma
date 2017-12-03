package com.sheng.wrma.model.entity;

import java.util.Date;

public class CommentDO {
    private Long id;

    private Integer blogId;

    private Integer parentId;

    private Integer floorNo;

    private String ipAddress;

    private String content;

    private Date createTime;

    private Date updateTime;

    private Date deleteTime;

    public CommentDO(Long id, Integer blogId, Integer parentId, Integer floorNo, String ipAddress, String content, Date createTime, Date updateTime, Date deleteTime) {
        this.id = id;
        this.blogId = blogId;
        this.parentId = parentId;
        this.floorNo = floorNo;
        this.ipAddress = ipAddress;
        this.content = content;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteTime = deleteTime;
    }

    public CommentDO() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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