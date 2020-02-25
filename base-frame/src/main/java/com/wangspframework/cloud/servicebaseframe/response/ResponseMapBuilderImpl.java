package com.wangspframework.cloud.servicebaseframe.response;

import java.util.Date;
import java.util.HashMap;

/**
 * @author spwang on 2019-12-14 at 13:08
 * @version 1.0.0
 * @since 1.0.0
 */
public class ResponseMapBuilderImpl implements ResponseMapBuilder {
    private int status;
    private String message;
    private HashMap<String, Object> data = new HashMap<>();
    private Date timestamp = new Date();

    @Override
    public HashMap<String, Object> get() {
        return this.data;
    }

    @Override
    public ResponseMapBuilder put(String key, Object value) {
        data.put(key,value);
        return this;
    }

    @Override
    public Integer status() {
        return this.status;
    }

    @Override
    public ResponseMapBuilder status(final Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String message() {
        return null;
    }

    public ResponseMapBuilder message(final String message) {
        this.message = message;
        return this;
    }

    @Override
    public Date timestamp() {
        return this.timestamp;
    }

    public ResponseMapBuilder timestamp(final Date timestamp) {
        this.timestamp = timestamp;
        return this;
    }


    @Override
    public Response<HashMap<String, Object>> build() {
        return new Response<>(this.status, this.message, this.data, null, this.timestamp);
    }
}
