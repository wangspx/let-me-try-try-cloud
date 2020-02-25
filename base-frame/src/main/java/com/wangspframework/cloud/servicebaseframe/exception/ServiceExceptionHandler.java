package com.wangspframework.cloud.servicebaseframe.exception;

import com.wangspframework.cloud.servicebaseframe.response.Code;
import com.wangspframework.cloud.servicebaseframe.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author spwang Created on 2019/12/2 at 8:29
 * @version 1.0.0
 */
@Slf4j
@RestControllerAdvice
public class ServiceExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Response serviceExceptionHandler(Exception e) {
        log.error("Catch {}, message -> {}", e.getClass().getSimpleName(), e.getMessage(), e);
        return Response.failure("未知错误");
    }

    @ExceptionHandler(ServiceException.class)
    public Response serviceExceptionHandler(ServiceException e) {
        log.error("Catch {}, message -> [{}]{}", e.getClass().getSimpleName(), e.getCode(), e.getMessage(), e);
        return Response.failure(String.format("[%s]%s", e.getCode(), e.getMessage()));
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Response serviceExceptionHandler(HttpRequestMethodNotSupportedException e) {
        log.error("Catch {}, message -> {}", e.getMessage(), e);
        return Response.failure(Code.CODE_405.getMessage());
    }
}
