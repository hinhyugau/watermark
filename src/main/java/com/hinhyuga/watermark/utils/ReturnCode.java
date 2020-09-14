package com.hinhyuga.watermark.utils;

public enum ReturnCode {
    SUCCESS(200,"获取成功！"),
    FAILED(500,"服务器内部错误!");

    private int key;
    private String value;

    ReturnCode(int key, String value) {
        this.key = key;
        this.value = value;
    }

    private static String getName(int key){
        for (ReturnCode value : ReturnCode.values()) {
            if (value.key == key){
                return value.value;
            }
        }
        return null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}