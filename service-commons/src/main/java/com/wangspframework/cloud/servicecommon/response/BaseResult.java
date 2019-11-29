package com.wangspframework.cloud.servicecommon.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author spwang Created on 2019/11/29 at 10:11
 * @version 1.0.0
 */
@Data
@AllArgsConstructor
public class BaseResult {
    /** 状态码 */
    private Integer code;
    /** 响应消息 */
    private String message;
    /** 响应数据 */
    private Object data;
    /** 响应时间戳 */
    private String timestamp;
}
