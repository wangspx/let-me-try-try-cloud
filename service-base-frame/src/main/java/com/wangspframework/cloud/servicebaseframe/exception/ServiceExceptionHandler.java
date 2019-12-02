package com.wangspframework.cloud.servicebaseframe.exception;

import com.wangspframework.cloud.servicebaseframe.response.Code;
import com.wangspframework.cloud.servicebaseframe.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author spwang Created on 2019/12/2 at 8:29
 * @version 1.0.0
 */
@Slf4j
@ControllerAdvice
public class ServiceExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result serviceExceptionHandler(Exception e) {
        log.error("Catch {}, message -> {}", e.getClass().getSimpleName(), e.getMessage(), e);
        return Result.failure(500, "未知错误");
    }

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Result serviceExceptionHandler(ServiceException e) {
        log.error("Catch {}, message -> [{}]{}", e.getClass().getSimpleName(), e.getCode(), e.getMessage(), e);
        return Result.failure(500, String.format("[%s]%s", e.getCode(), e.getMessage()));
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    public Result serviceExceptionHandler(HttpRequestMethodNotSupportedException e) {
        log.error("Catch {}, message -> {}", e.getMessage(), e);
        return Result.failure(Code.CODE_405);
    }
}
