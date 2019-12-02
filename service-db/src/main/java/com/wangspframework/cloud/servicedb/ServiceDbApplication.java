package com.wangspframework.cloud.servicedb;

import com.wangspframework.cloud.servicebaseframe.BaseServiceFrameApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceDbApplication extends BaseServiceFrameApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDbApplication.class, args);
    }

}
