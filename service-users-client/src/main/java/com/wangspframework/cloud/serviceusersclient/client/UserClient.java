package com.wangspframework.cloud.serviceusersclient.client;

import com.wangspframework.cloud.servicebaseframe.response.Response;
import com.wangspframework.cloud.serviceusersclient.entity.User;
import com.wangspframework.cloud.serviceusersclient.exception.ServiceUserException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author spwang Created on 2020/2/25 at 17:29
 * @version 1.0.0
 */
@RestController
@FeignClient("SERVICE-DB")
public interface UserClient {
    /**
     * 根据用户id获取
     *
     * @param id 用户id
     * @return 用户实体
     * @throws ServiceUserException 用户接口异常类
     */
    @GetMapping("/users/{id}")
    Response<User> getUserById(@PathVariable("id") Integer id) throws ServiceUserException;

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return 成功新增的用户信息
     * @throws ServiceUserException 用户接口异常类
     */
    @PostMapping("/users/")
    Response<User> addUser(@RequestBody User user) throws ServiceUserException;

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     * @return 成功更新的用户信息
     * @throws ServiceUserException 用户接口异常类
     */
    @PutMapping("/users/")
    Response<User> updateUser(@RequestBody User user) throws ServiceUserException;

    /**
     * 删除用户
     *
     * @param id 用户id
     * @return 成功删除的用户信息
     * @throws ServiceUserException 用户接口异常类
     */
    @DeleteMapping("/users/{id}")
    Response<User> deleteUser(@PathVariable("id") Integer id) throws ServiceUserException;
}
