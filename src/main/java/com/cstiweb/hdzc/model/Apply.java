package com.cstiweb.hdzc.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Apply implements Serializable {
    private Integer id;

    private String userId;

    @ApiModelProperty(value = "综测类型 id")
    private Integer typeId;

    @ApiModelProperty(value = "学生审核描述")
    private String description;

    @ApiModelProperty(value = "图片地址")
    private String picture;

    @ApiModelProperty(value = "审核状态")
    private String statu;

    @ApiModelProperty(value = "驳回意见")
    private String boHuiYiJian;

    @ApiModelProperty(value = "申请时间")
    private String applyTime;

    @ApiModelProperty(value = "驳回时间")
    private String boHuiTime;

    private String isDelete;

    @ApiModelProperty(value = "专业")
    private String zhuanYe;

    @ApiModelProperty(value = "年级")
    private String grade;

    @ApiModelProperty(value = "班级")
    private String banJi;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getBoHuiYiJian() {
        return boHuiYiJian;
    }

    public void setBoHuiYiJian(String boHuiYiJian) {
        this.boHuiYiJian = boHuiYiJian;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getBoHuiTime() {
        return boHuiTime;
    }

    public void setBoHuiTime(String boHuiTime) {
        this.boHuiTime = boHuiTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getZhuanYe() {
        return zhuanYe;
    }

    public void setZhuanYe(String zhuanYe) {
        this.zhuanYe = zhuanYe;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getBanJi() {
        return banJi;
    }

    public void setBanJi(String banJi) {
        this.banJi = banJi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", typeId=").append(typeId);
        sb.append(", description=").append(description);
        sb.append(", picture=").append(picture);
        sb.append(", statu=").append(statu);
        sb.append(", boHuiYiJian=").append(boHuiYiJian);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", boHuiTime=").append(boHuiTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", zhuanYe=").append(zhuanYe);
        sb.append(", grade=").append(grade);
        sb.append(", banJi=").append(banJi);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}