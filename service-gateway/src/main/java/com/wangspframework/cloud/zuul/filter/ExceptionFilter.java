package com.wangspframework.cloud.zuul.filter;

import com.alibaba.fastjson.JSON;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.wangspframework.cloud.servicebaseframe.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author spwang Created on 2019/12/2 at 10:22
 * @version 1.0.0
 */
@Slf4j
@Component
public class ExceptionFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.ERROR_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        Throwable e = ctx.getThrowable();
        log.error("Catch {}, message -> {}", e.getClass().getName(), e.getMessage(), e);

        ctx.setResponseStatusCode(200);
        HttpServletResponse response = ctx.getResponse();
        try {
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(Response.failure()));
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        ctx.setSendZuulResponse(false);

        return null;
    }
}
