package com.wangsp.cloud.servicedb.repository;

import com.wangsp.cloud.servicedb.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author spwang Created on 2019/11/25 at 20:44
 * @version 1.0.0
 */
public interface OrderRepository extends JpaRepository<Order, String> {
}
