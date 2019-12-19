package com.wangspframework.cloud.zuul.config;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 网关路由正则匹配服务组件
 *
 * @author spwang Created on 2019/12/19 at 10:38
 * @version 1.0.0
 */
@Configuration
public class RouteMapperBean {
    /**
     * @return /api-user-v1/ -> /user/v1/
     */
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        return new PatternServiceRouteMapper("api-(?<name>^.+)-(?<version>v.+$)", "${name}");
    }
}
