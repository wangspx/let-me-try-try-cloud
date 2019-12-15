package com.wangspframework.cloud.servicebaseframe.exception;

import com.wangspframework.cloud.servicebaseframe.response.Code;
import com.wangspframework.cloud.servicebaseframe.response.Response;
import com.wangspframework.cloud.servicebaseframe.utils.RequestMappingList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author spwang Created on 2019/12/2 at 11:52
 * @version 1.0.0
 */
@RestController
public class NotFoundExceptionHandler implements ErrorController{

    @Autowired
    private RequestMappingList requestMappingList;

    @Override
    public String getErrorPath() {
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        request.setAttribute("name", request.getRequestURI());
        return "/error11";
    }

    @RequestMapping("/error")
    public Response notFoundHandler(HttpServletRequest request){
        System.out.println(request.getAttribute("name"));
        List<String> superPath = requestMappingList.findSuperPath(request.getRequestURI());

        if (superPath == null) {
            superPath = requestMappingList.findSuperPath(request.getServletPath());
        }

        if (superPath == null) {
            superPath = requestMappingList.findSuperPath(request.getContextPath());
        }

        Response failure = Response.builder()
                .status(Code.CODE_404.getCode())
                .message(Code.CODE_404.getMessage())
                .build();

        if (superPath != null) {
            failure.setData(superPath);
        }

        return failure;
    }
}
