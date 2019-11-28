package com.wangspframework.cloud.servicedb.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author spwang Created on 2019/11/25 at 20:19
 * @version 1.0.0
 */
@Data
@Table
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String email;
}
