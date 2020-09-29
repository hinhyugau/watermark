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
    private Float transp;
    private String delFalg;

    public Image() {
    }

    public Image(String name, String width, String height, String waterText, String waterTextColor, String waterTextBackground, String waterTextFont, String waterTextWidth, String waterTextHeight, String waterTextLocal, String suffix, String url, Float transp, String delFalg, Date createTime, Date updateTime) {
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

    private Date createTime;

    private Date updateTime;

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

    public Float getTransp() {
        return transp;
    }

    public void setTransp(Float transp) {
        this.transp = transp;
    }
}
