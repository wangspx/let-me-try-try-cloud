package com.wangspframework.cloud.servicebaseframe.response;

import javafx.util.Builder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author spwang on 2019-12-14 at 12:58
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ResponseMapBuilder extends Builder<Response<HashMap<String, Object>>> {
    Integer status();

    ResponseMapBuilder status(Integer code);

    String message();

    ResponseMapBuilder message(String message);

    HashMap<String, Object> get();

    ResponseMapBuilder put(String key, Object value);

    Date timestamp();

    ResponseMapBuilder timestamp(Date timestamp);
}
