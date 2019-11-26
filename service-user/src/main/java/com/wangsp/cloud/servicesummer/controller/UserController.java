package com.wangsp.cloud.servicesummer.controller;

import com.wangsp.cloud.servicefeignclient.entity.User;
import com.wangsp.cloud.servicefeignclient.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author spwang Created on 2019/11/25 at 21:49
 * @version 1.0.0
 */
@RestController
@RequestMapping("/users")
public class UserController implements Version1Controller{
    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public User getUser(@PathVariable Integer id) {
        return userClient.getUserById(id);
    }

    @GetMapping()
    public User add() {
        User user = new User();
        user.setUsername("xiaowang" + (int)(Math.random() * 100));
        user.setPassword("123456");
        user.setPhone("12345678901");
        user.setEmail("admin@123");
        return userClient.addUser(user);
    }
}
