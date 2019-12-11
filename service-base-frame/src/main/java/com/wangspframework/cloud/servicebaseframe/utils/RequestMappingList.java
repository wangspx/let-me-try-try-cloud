package com.wangspframework.cloud.servicebaseframe.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author spwang Created on 2019/12/3 at 10:03
 * @version 1.0.0
 */
@Component
public class RequestMappingList {
    @Autowired
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    private List<String> urls;

    @PostConstruct
    private void init() {
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMappingHandlerMapping.getHandlerMethods();

        urls = new ArrayList<>();
        for (RequestMappingInfo requestMappingInfo : handlerMethods.keySet()) {
            Set<String> patterns = requestMappingInfo.getPatternsCondition().getPatterns();
            urls.addAll(patterns);
        }
    }

    public List<String> findSuperPath(String path) {
        return urls.stream().filter(s-> s.startsWith(path)).collect(Collectors.toList());
    }
}
