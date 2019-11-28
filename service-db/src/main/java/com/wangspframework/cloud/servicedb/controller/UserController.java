package com.wangspframework.cloud.servicedb.controller;

import com.wangspframework.cloud.servicedb.repository.UserRepository;
import com.wangspframework.cloud.servicedbclient.client.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author spwang Created on 2019/11/25 at 22:37
 * @version 1.0.0
 */
@Slf4j
@RestController
public class UserController implements UserClient {
    @Autowired
    private UserRepository userRepository;

    @Override
    public com.wangspframework.cloud.servicedbclient.entity.User getUserById(Integer id) {
        com.wangspframework.cloud.servicedb.entity.User user = userRepository.getOne(id);
        return convert((user));
    }

    @Override
    public com.wangspframework.cloud.servicedbclient.entity.User addUser(com.wangspframework.cloud.servicedbclient.entity.User user) {
        log.info("add user");
        return convert(userRepository.save(convert((user))));
    }

    private com.wangspframework.cloud.servicedbclient.entity.User convert(com.wangspframework.cloud.servicedb.entity.User user) {
        com.wangspframework.cloud.servicedbclient.entity.User entity = new com.wangspframework.cloud.servicedbclient.entity.User();
        entity.setId(user.getId());
        entity.setUsername(user.getUsername());
        entity.setPassword(user.getPassword());
        entity.setPhone(user.getPhone());
        entity.setEmail(user.getEmail());
        return entity;
    }

    private com.wangspframework.cloud.servicedb.entity.User convert(com.wangspframework.cloud.servicedbclient.entity.User user) {
        com.wangspframework.cloud.servicedb.entity.User entity = new com.wangspframework.cloud.servicedb.entity.User();
        entity.setId(user.getId());
        entity.setUsername(user.getUsername());
        entity.setPassword(user.getPassword());
        entity.setPhone(user.getPhone());
        entity.setEmail(user.getEmail());
        return entity;
    }
}
