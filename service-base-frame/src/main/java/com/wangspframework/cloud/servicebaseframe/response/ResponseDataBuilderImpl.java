package com.wangspframework.cloud.servicebaseframe.response;

import java.util.Date;
import java.util.Map;

/**
 * @author spwang on 2019-12-14 at 11:36
 * @version 1.0.0
 * @since 1.0.0
 */
public class ResponseDataBuilderImpl<T> implements ResponseDataBuilder<T> {
    private int status;
    private String message;
    private T data;
    private Pagination pagination;
    private Date timestamp = new Date();
    private Map<String,Object> map;

    @Override
    public Integer status() {
        return this.status;
    }

    @Override
    public ResponseDataBuilder<T> status(final Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String message() {
        return null;
    }

    public ResponseDataBuilder<T> message(final String message) {
        this.message = message;
        return this;
    }

    @Override
    public T data() {
        return this.data;
    }

    public ResponseDataBuilder<T> data(final T data) {
        this.data = data;
        return this;
    }

    @Override
    public Pagination pagination() {
        return this.pagination;
    }

    public ResponseDataBuilder<T> pagination(final Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    @Override
    public Date timestamp() {
        return this.timestamp;
    }

    public ResponseDataBuilder<T> timestamp(final Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Response<T> build() {
        return new Response<T>(this.status, this.message, this.data, this.pagination, this.timestamp);
    }
}
