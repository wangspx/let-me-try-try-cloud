package com.wangspframework.cloud.servicedb.repository;

import com.wangspframework.cloud.servicedb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author spwang Created on 2019/11/25 at 20:41
 * @version 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
