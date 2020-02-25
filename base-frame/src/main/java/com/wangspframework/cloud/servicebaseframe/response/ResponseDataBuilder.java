package com.wangspframework.cloud.servicebaseframe.response;

import javafx.util.Builder;

import java.util.Date;

/**
 * @author spwang on 2019-12-14 at 11:34
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ResponseDataBuilder<T> extends Builder<Response<T>> {
    Integer status();

    ResponseDataBuilder<T> status(Integer code);

    String message();

    ResponseDataBuilder<T> message(String message);

    T data();

    ResponseDataBuilder<T> data(T data);


    Pagination pagination();

    ResponseDataBuilder<T> pagination(Pagination pagination);

    Date timestamp();

    ResponseDataBuilder<T> timestamp(Date timestamp);
}
