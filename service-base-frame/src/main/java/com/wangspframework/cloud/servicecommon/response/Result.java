package com.wangspframework.cloud.servicecommon.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

/**
 * @author spwang Created on 2019/11/29 at 10:22
 * @version 1.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> extends BaseResult<T> {
    public Result() {
        super(null, null, null, null);
    }

    public Result(Code code, T data) {
        this(code.getCode(), code.getMessage(), data);
    }

    public Result(Integer code, String message, T data) {
        super(code, message, data, LocalDateTime.now());
    }

    public static  Result success() {
        return new Result<>(Code.CODE_200, null);
    }

    public static  Result success(Object data) {
        return new Result<>(Code.CODE_200, data);
    }

    public static Result failure() {
        return new Result<>(Code.CODE_503, null);
    }

    public static Result failure(Code code) {
        return new Result<>(code, null);
    }

    public static Result failure(Integer code, String message) {
        return new Result<>(code, message, null);
    }
}
