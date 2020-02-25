package com.wangspframework.cloud.servicebaseframe.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author spwang Created on 2019/11/29 at 11:58
 * @version 1.0.0
 */
@Data
@AllArgsConstructor
public class Pagination {
    private Integer current;
    private Integer size;
    private Integer total;
}
