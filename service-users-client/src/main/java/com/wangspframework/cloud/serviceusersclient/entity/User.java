package com.wangspframework.cloud.serviceusersclient.entity;

import lombok.Data;

/**
 * @author spwang Created on 2020/2/25 at 17:30
 * @version 1.0.0
 */
@Data
public class User {
    private Integer id;
    /** 用户名 */
    private String username;
    /** 密码 */
    private String password;
    /** 头像 */
    private String avatar;
    /** 手机号码 */
    private String phone;
    /** 邮箱 */
    private String email;
    /** 用户信息介绍 */
    private String remark;
}
