package com.wangspframework.cloud.servicecommon.response;

import com.alibaba.fastjson.JSON;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author spwang Created on 2019/11/29 at 10:22
 * @version 1.0.0
 */
public class Result extends BaseResult {
    public Result(Integer code, String message, Object data) {
        super(code, message, data, LocalDateTime.now().toString());
    }

    public Result(Integer code, String message, Object data, String timestamp) {
        super(code, message, data, timestamp);
    }

    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(new Result(200, "操作成功", "22222")));
    }
}
