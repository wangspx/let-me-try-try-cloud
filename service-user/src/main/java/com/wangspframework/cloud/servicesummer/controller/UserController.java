package com.wangspframework.cloud.servicesummer.controller;

import com.wangspframework.cloud.servicedbclient.entity.User;
import com.wangspframework.cloud.servicedbclient.client.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author spwang Created on 2019/11/25 at 21:49
 * @version 1.0.0
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController implements Version1Controller{
    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public User getUser(@PathVariable Integer id) {
        log.info("find the user for id = {}" , id);
        new Thread(()->{
            log.info("I am a other thread, userId = " + id);
        }).start();
        return userClient.getUserById(id);
    }

    @PostMapping()
    public User add(@RequestBody User user) {
        return userClient.addUser(user);
    }
}
