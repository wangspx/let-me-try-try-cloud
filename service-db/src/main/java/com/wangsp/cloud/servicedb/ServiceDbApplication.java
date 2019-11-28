package com.wangsp.cloud.servicedb;

import com.wangsp.cloud.servicecommon.aspect.EnableTraceLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableTraceLog
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDbApplication.class, args);
    }

}
