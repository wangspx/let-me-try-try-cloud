package com.wangsp.cloud.servicedb.controller;

import com.wangsp.cloud.servicedb.entity.User;
import com.wangsp.cloud.servicedb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author spwang Created on 2019/11/25 at 22:37
 * @version 1.0.0
 */
@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("{id}")
    public User get(@PathVariable Integer id) {
        return userRepository.getOne(id);
    }

    @PostMapping()
    public User add(@RequestBody User user) {
        return userRepository.save(user);
    }
}
