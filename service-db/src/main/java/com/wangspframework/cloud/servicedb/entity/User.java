package com.wangspframework.cloud.servicedb.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * @author spwang Created on 2019/11/25 at 20:19
 * @version 1.0.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Table
@Entity
public class User extends BaseEntity{

    private String username;
    private String account;
    private String password;
    private String phone;
    private String email;
}
