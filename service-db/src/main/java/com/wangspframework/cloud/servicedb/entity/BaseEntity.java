package com.wangspframework.cloud.servicedb.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 数据实体基础属性
 *
 * @author spwang Created on 2019/12/27 at 16:00
 * @version 1.0.0
 */
@Data
@MappedSuperclass
public class BaseEntity {
    /** 数据库主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /** 创建时间 */
    private String createAt;
    /** 更新时间 */
    private String updateAt;
    /** 数据状态 */
    private Integer status;
}
