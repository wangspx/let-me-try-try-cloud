package com.wangspframework.cloud.servicebaseframe.exception;

/**
 * @author spwang Created on 2019/11/29 at 17:47
 * @version 1.0.0
 */
public enum ErrorCode {
    E01_0001("01-01-0001","未知错误");
    private String code;
    private String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
}
