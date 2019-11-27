package com.wangsp.cloud.servicedb.controller;

import com.wangsp.cloud.servicedb.entity.User;
import com.wangsp.cloud.servicedb.repository.UserRepository;
import com.wangsp.cloud.servicedbclient.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author spwang Created on 2019/11/25 at 22:37
 * @version 1.0.0
 */
@RestController
public class UserController implements UserClient {
    @Autowired
    private UserRepository userRepository;

    @Override
    public com.wangsp.cloud.servicedbclient.entity.User getUserById(Integer id) {
        User user = userRepository.getOne(id);
        return convert((user));
    }

    @Override
    public com.wangsp.cloud.servicedbclient.entity.User addUser(com.wangsp.cloud.servicedbclient.entity.User user) {
        return convert(userRepository.save(convert((user))));
    }

    private com.wangsp.cloud.servicedbclient.entity.User convert(User user) {
        com.wangsp.cloud.servicedbclient.entity.User entity = new com.wangsp.cloud.servicedbclient.entity.User();
        entity.setId(user.getId());
        entity.setUsername(user.getUsername());
        entity.setPassword(user.getPassword());
        entity.setPhone(user.getPhone());
        entity.setEmail(user.getEmail());
        return entity;
    }

    private User convert(com.wangsp.cloud.servicedbclient.entity.User user) {
        User entity = new User();
        entity.setId(user.getId());
        entity.setUsername(user.getUsername());
        entity.setPassword(user.getPassword());
        entity.setPhone(user.getPhone());
        entity.setEmail(user.getEmail());
        return entity;
    }
}
