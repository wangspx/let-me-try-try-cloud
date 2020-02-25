package com.wangspframework.cloud.servicebaseframe.exception;

/**
 * @author spwang Created on 2019/11/29 at 17:47
 * @version 1.0.0
 */
public enum ErrorCode {
    /**
     * { code: "01-01-0001", message: "未知错误" }
     */
    E01_0001("01-01-0001", "未知错误");
    /**
     * 系统异常状态码
     */
    private String code;
    /**
     * 系统异常信息
     */
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
