package com.wangspframework.cloud.servicebaseframe.exception;

import com.wangspframework.cloud.servicebaseframe.response.Result;
import lombok.extern.slf4j.Slf4j;
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
        return Result.failure(500, e.getMessage());
    }
}
