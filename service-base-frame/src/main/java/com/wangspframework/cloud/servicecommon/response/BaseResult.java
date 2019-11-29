package com.wangspframework.cloud.servicecommon.response;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author spwang Created on 2019/11/29 at 10:11
 * @version 1.0.0
 */
public class BaseResult<T> implements Serializable {
    private static final long serialVersionUID = -1L;

    /** 状态码 */
    private Integer code;
    /** 响应消息 */
    private String message;
    /** 响应数据 */
    private T data;
    /** 分页信息 */
    private Pagination pagination;
    /** 响应时间戳 */
    private LocalDateTime timestamp;

    public BaseResult(Integer code, String message, T data, LocalDateTime timestamp) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = timestamp;
    }

    public Integer getCode() {
        return code;
    }

    public BaseResult setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public BaseResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public BaseResult setData(T data) {
        this.data = data;
        return this;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public BaseResult setPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public BaseResult setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
}