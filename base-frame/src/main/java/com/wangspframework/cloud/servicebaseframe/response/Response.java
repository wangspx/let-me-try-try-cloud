package com.wangspframework.cloud.servicebaseframe.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

/**
 * @author spwang on 2019-12-14 at 00:21
 * @version 1.0.0
 * @since 1.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> implements Serializable {
    private int status;
    private String message;
    private T data;
    private Pagination pagination;
    private Date timestamp;

    public Response() {
    }

    Response(final int status, final String message, final T data, final Pagination pagination, final Date timestamp) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.pagination = pagination;
        this.timestamp = timestamp;
    }

    public static <T> ResponseDataBuilder<T> builder() {
        return new ResponseDataBuilderImpl<>();
    }

    public static ResponseMapBuilder hashMapBuilder() {
        return new ResponseMapBuilderImpl();
    }

    public static Response success() {
        return new ResponseDataBuilderImpl<>()
                .status(200)
                .message("ok")
                .build();
    }

    public static <T> Response<T> success(T data) {
        return new ResponseDataBuilderImpl<T>()
                .status(200)
                .message("ok")
                .data(data)
                .build();
    }

    public static <T> Response<T> success(T data, Pagination pagination) {
        return new ResponseDataBuilderImpl<T>()
                .status(200)
                .message("ok")
                .data(data)
                .pagination(pagination)
                .build();
    }

    public static Response failure() {
        return new ResponseDataBuilderImpl<>()
                .status(500)
                .message("error")
                .build();
    }

    public static Response failure(String message) {
        return new ResponseDataBuilderImpl<>()
                .status(500)
                .message(message)
                .build();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}