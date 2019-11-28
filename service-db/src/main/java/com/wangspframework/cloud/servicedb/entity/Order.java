package com.wangspframework.cloud.servicedb.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author spwang Created on 2019/11/25 at 20:23
 * @version 1.0.0
 */
@Data
@Table
@Entity
public class Order {
    @Id
    private String uuid;
    private Integer userId;
    private Date createDate;
}
