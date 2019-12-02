package com.wangspframework.cloud.zuul.filter;

import com.alibaba.fastjson.JSON;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.wangspframework.cloud.servicebaseframe.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

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
        log.info("进入异常过滤器");
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.setResponseBody(JSON.toJSONString(Result.failure(500, "未知错误")));
        return null;
    }
}
