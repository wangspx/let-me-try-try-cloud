package com.wangspframework.cloud.servicedbclient.client;

import com.wangspframework.cloud.servicedbclient.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author spwang Created on 2019/11/25 at 23:08
 * @version 1.0.0
 */
@FeignClient("SERVICE-DB")
public interface UserClient {
    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Integer id);

    @PostMapping("/users/")
    User addUser(@RequestBody User user);
}
