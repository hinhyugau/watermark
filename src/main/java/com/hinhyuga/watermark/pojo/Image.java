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
    private String url;
    private String delFalg;



    private Date createTime;

    private Date updateTime;

    public Image() {
    }

    public Image(String id, String name, String width, String height, String url, String delFalg, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.height = height;
        this.url = url;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Image)) return false;
        Image image = (Image) o;
        return Objects.equals(id, image.id) &&
                Objects.equals(name, image.name) &&
                Objects.equals(width, image.width) &&
                Objects.equals(height, image.height) &&
                Objects.equals(url, image.url) &&
                Objects.equals(delFalg, image.delFalg) &&
                Objects.equals(createTime, image.createTime) &&
                Objects.equals(updateTime, image.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, width, height, url, delFalg, createTime, updateTime);
    }

    @Override
    public String toString() {
        return "Image{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", url='" + url + '\'' +
                ", delFalg='" + delFalg + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
