package com.example.demo.enums;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/10 上午9:20
 * @Description:
 */
public enum RespEnum {


    SUCCESS("0", "成功"),
    UNKNOWN_ERROR("-1","未知错误");

    private String code;

    private String value;

    RespEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "RespEnum{" +
                "code=" + code +
                ", value='" + value + '\'' +
                '}';
    }
}
