package com.cstiweb.hdzc.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "学工号")
    private String xueGongId;

    private String password;

    @ApiModelProperty(value = "学院id")
    private Integer xueYuanId;

    @ApiModelProperty(value = "专业")
    private String zhuanYe;

    @ApiModelProperty(value = "年级")
    private String grade;

    @ApiModelProperty(value = "班级")
    private String banJi;

    @ApiModelProperty(value = "账号类型")
    private Integer type;

    private Double zongCe;

    @ApiModelProperty(value = "表示是否删除  0为删除，1未删除")
    private Integer isDelete;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getXueGongId() {
        return xueGongId;
    }

    public void setXueGongId(String xueGongId) {
        this.xueGongId = xueGongId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getXueYuanId() {
        return xueYuanId;
    }

    public void setXueYuanId(Integer xueYuanId) {
        this.xueYuanId = xueYuanId;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getZongCe() {
        return zongCe;
    }

    public void setZongCe(Double zongCe) {
        this.zongCe = zongCe;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", idCard=").append(idCard);
        sb.append(", xueGongId=").append(xueGongId);
        sb.append(", password=").append(password);
        sb.append(", xueYuanId=").append(xueYuanId);
        sb.append(", zhuanYe=").append(zhuanYe);
        sb.append(", grade=").append(grade);
        sb.append(", banJi=").append(banJi);
        sb.append(", type=").append(type);
        sb.append(", zongCe=").append(zongCe);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}