package com.hinhyuga.watermark.utils;

import java.io.Serializable;
import java.util.Objects;

/**
 * return msg util
 */
public class ReturnMsgUtil implements Serializable {
    private static final Long serializable = 1L;
    private String code;
    private Object obj;
    private String msg;

    public ReturnMsgUtil() {
    }

    public ReturnMsgUtil(String code, Object obj, String msg) {
        this.code = code;
        this.obj = obj;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReturnMsgUtil)) return false;
        ReturnMsgUtil that = (ReturnMsgUtil) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(obj, that.obj) &&
                Objects.equals(msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, obj, msg);
    }

    @Override
    public String toString() {
        return "ReturnMsgUtil{" +
                "code='" + code + '\'' +
                ", obj=" + obj +
                ", msg='" + msg + '\'' +
                '}';
    }
}
