package com.wangspframework.cloud.servicebaseframe.exception;

import com.wangspframework.cloud.servicebaseframe.response.Code;
import com.wangspframework.cloud.servicebaseframe.response.Result;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author spwang Created on 2019/12/2 at 11:52
 * @version 1.0.0
 */
@RestController
public class NotFoundExceptionHandler implements ErrorController{

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public Result handleError(HttpServletRequest request){
        return Result.failure(Code.CODE_404);
    }
}
