package com.wangspframework.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author spwang Created on 2019/11/29 at 9:43
 * @version 1.0.0
 */
@Slf4j
@Component
public class ResponseLogFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
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
        HttpServletResponse response = ctx.getResponse();

        log.info("Response Status Code -> {}",response.getStatus());

        String body = null;
        try {
            body = StreamUtils.copyToString(ctx.getResponseDataStream(), StandardCharsets.UTF_8);
            ctx.setResponseBody(body);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (StringUtils.isNotBlank(body)) {
            log.info("Response Body -> {}", body);
        }

        return null;
    }
}
