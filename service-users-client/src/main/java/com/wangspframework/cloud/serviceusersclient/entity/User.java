package com.wangspframework.cloud.serviceusersclient.entity;

import lombok.Data;

/**
 * @author spwang Created on 2020/2/25 at 17:30
 * @version 1.0.0
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
}
