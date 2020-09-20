package com.hinhyuga.watermark.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Image implements Serializable {
    private static final Long serializale = 1L;


    private String id;
    private String name;
    private String width;
    private String height;
    private String waterText;
    private String waterTextColor;
    private String waterTextBackground;
    private String waterTextFont;
    private String waterTextWidth;
    private String waterTextHeight;
    private String waterTextLocal;
    private String suffix;
    private String url;
    private Long transp;
    private String delFalg;

    public Image() {
    }



    private Date createTime;

    private Date updateTime;

    public Image(String id, String name, String width, String height, String waterText, String waterTextColor, String waterTextBackground, String waterTextFont, String waterTextWidth, String waterTextHeight, String waterTextLocal, String suffix, String url, Long transp, String delFalg, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.height = height;
        this.waterText = waterText;
        this.waterTextColor = waterTextColor;
        this.waterTextBackground = waterTextBackground;
        this.waterTextFont = waterTextFont;
        this.waterTextWidth = waterTextWidth;
        this.waterTextHeight = waterTextHeight;
        this.waterTextLocal = waterTextLocal;
        this.suffix = suffix;
        this.url = url;
        this.transp = transp;
        this.delFalg = delFalg;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDelFalg() {
        return delFalg;
    }

    public void setDelFalg(String delFalg) {
        this.delFalg = delFalg;
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


    public String getWaterText() {
        return waterText;
    }

    public void setWaterText(String waterText) {
        this.waterText = waterText;
    }

    public String getWaterTextColor() {
        return waterTextColor;
    }

    public void setWaterTextColor(String waterTextColor) {
        this.waterTextColor = waterTextColor;
    }

    public String getWaterTextBackground() {
        return waterTextBackground;
    }

    public void setWaterTextBackground(String waterTextBackground) {
        this.waterTextBackground = waterTextBackground;
    }

    public String getWaterTextFont() {
        return waterTextFont;
    }

    public void setWaterTextFont(String waterTextFont) {
        this.waterTextFont = waterTextFont;
    }

    public String getWaterTextWidth() {
        return waterTextWidth;
    }

    public void setWaterTextWidth(String waterTextWidth) {
        this.waterTextWidth = waterTextWidth;
    }

    public String getWaterTextHeight() {
        return waterTextHeight;
    }

    public void setWaterTextHeight(String waterTextHeight) {
        this.waterTextHeight = waterTextHeight;
    }

    public String getWaterTextLocal() {
        return waterTextLocal;
    }

    public void setWaterTextLocal(String waterTextLocal) {
        this.waterTextLocal = waterTextLocal;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Long getTransp() {
        return transp;
    }

    public void setTransp(Long transp) {
        this.transp = transp;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", waterText='" + waterText + '\'' +
                ", waterTextColor='" + waterTextColor + '\'' +
                ", waterTextBackground='" + waterTextBackground + '\'' +
                ", waterTextFont='" + waterTextFont + '\'' +
                ", waterTextWidth='" + waterTextWidth + '\'' +
                ", waterTextHeight='" + waterTextHeight + '\'' +
                ", waterTextLocal='" + waterTextLocal + '\'' +
                ", suffix='" + suffix + '\'' +
                ", url='" + url + '\'' +
                ", transp=" + transp +
                ", delFalg='" + delFalg + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Image)) return false;
        Image image = (Image) o;
        return Objects.equals(id, image.id) &&
                Objects.equals(name, image.name) &&
                Objects.equals(width, image.width) &&
                Objects.equals(height, image.height) &&
                Objects.equals(waterText, image.waterText) &&
                Objects.equals(waterTextColor, image.waterTextColor) &&
                Objects.equals(waterTextBackground, image.waterTextBackground) &&
                Objects.equals(waterTextFont, image.waterTextFont) &&
                Objects.equals(waterTextWidth, image.waterTextWidth) &&
                Objects.equals(waterTextHeight, image.waterTextHeight) &&
                Objects.equals(waterTextLocal, image.waterTextLocal) &&
                Objects.equals(suffix, image.suffix) &&
                Objects.equals(url, image.url) &&
                Objects.equals(transp, image.transp) &&
                Objects.equals(delFalg, image.delFalg) &&
                Objects.equals(createTime, image.createTime) &&
                Objects.equals(updateTime, image.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, width, height, waterText, waterTextColor, waterTextBackground, waterTextFont, waterTextWidth, waterTextHeight, waterTextLocal, suffix, url, transp, delFalg, createTime, updateTime);
    }
}
