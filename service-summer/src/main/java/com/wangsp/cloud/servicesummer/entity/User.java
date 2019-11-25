package com.wangsp.cloud.servicesummer.entity;

import lombok.Data;

/**
 * @author spwang Created on 2019/11/25 at 23:18
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
