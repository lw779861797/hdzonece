package com.cstiweb.hdzc.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Type implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "所属综测父类型")
    private Integer parentId;

    private String name;

    @ApiModelProperty(value = "该综测项分数")
    private Double score;

    private Integer isDelete;

    @ApiModelProperty(value = "所属学院")
    private Integer xueYuanId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getXueYuanId() {
        return xueYuanId;
    }

    public void setXueYuanId(Integer xueYuanId) {
        this.xueYuanId = xueYuanId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", score=").append(score);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", xueYuanId=").append(xueYuanId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}