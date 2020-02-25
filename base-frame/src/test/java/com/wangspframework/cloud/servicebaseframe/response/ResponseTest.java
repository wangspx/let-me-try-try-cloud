package com.wangspframework.cloud.servicebaseframe.response;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author spwang on 2019-12-14 at 11:48
 * @version 1.0.0
 * @since 1.0.0
 */
public class ResponseTest {

    @Test
    public void test_1() {
        Response<Integer> ok = Response.<Integer>builder().status(200).data(1234).message("ok").build();
        System.out.println(JSON.toJSONString(ok));
    }

    @Test
    public void test_2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Response<List<Integer>> ok = Response.<List<Integer>>builder()
                .status(200)
                .message("ok")
                .data(list)
                .pagination(new Pagination(1, 3, 2))
                .build();

        System.out.println(JSON.toJSONString(ok));
    }

    @Test
    public void test_3() {
        Response<HashMap<String, Object>> ok = Response.hashMapBuilder()
                .status(200)
                .message("ok")
                .put("user", "tony")
                .put("age", "18")
                .build();
        System.out.println(JSON.toJSONString(ok));
    }

    @Test
    public void test_4() {
        Response success_1 = Response.success();
        System.out.println(JSON.toJSONString(success_1));

        Response success_2 = Response.success(new int[] {1,2,3}, new Pagination(1, 3, 3));
        System.out.println(JSON.toJSONString(success_2));

        Response success_3 = Response.success("1");
        Response success_4 = Response.success("2");
        System.out.println(JSON.toJSONString(success_3));
    }

    @Test
    public void test_5() {
        Response failure_1 = Response.failure();
        System.out.println(JSON.toJSONString(failure_1));

        Response failure_2 = Response.failure("it is failure");
        Response failure_3 = Response.failure("it is error");
        System.out.println(JSON.toJSONString(failure_2));
    }
}