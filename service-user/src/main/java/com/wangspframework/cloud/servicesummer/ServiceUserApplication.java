package com.wangspframework.cloud.servicesummer;

import com.wangspframework.cloud.servicebaseframe.BaseServiceFrameApplication;
import com.wangspframework.cloud.servicebaseframe.aspect.EnableTraceLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableTraceLog
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.wangspframework.cloud.servicedbclient.client")
public class ServiceUserApplication extends BaseServiceFrameApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApplication.class, args);
    }

}
