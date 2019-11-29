package com.wangspframework.cloud.servicebaseframe.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author spwang Created on 2019/11/29 at 17:21
 * @version 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceException extends Exception {
    private String code;

    public ServiceException(ErrorCode code) {
        super(String.format("[%s]%s", code.getCode(), code.getMessage()));
        this.code = code.getCode();
    }

    public ServiceException(ErrorCode code, Throwable cause) {
        super(String.format("[%s]%s", code.getCode(), code.getMessage()), cause);
        this.code = code.getCode();
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String code, String message, Throwable cause) {
        super(String.format("[%s]%s", code, message), cause);
        this.code = code;
    }
}
