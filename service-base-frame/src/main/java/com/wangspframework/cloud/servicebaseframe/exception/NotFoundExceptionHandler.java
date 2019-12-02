package com.wangspframework.cloud.servicebaseframe.exception;

import com.wangspframework.cloud.servicebaseframe.response.Code;
import com.wangspframework.cloud.servicebaseframe.response.Result;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @author spwang Created on 2019/12/2 at 11:52
 * @version 1.0.0
 */
@RestControllerAdvice
public class NotFoundExceptionHandler {

    @ExceptionHandler(value = NoHandlerFoundException.class)
    public Result notFoundHandler(NoHandlerFoundException e) throws Exception {
        return Result.failure(Code.CODE_404);
    }
}
