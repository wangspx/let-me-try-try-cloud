package com.wangspframework.cloud.servicecommon.aspect;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author spwang Created on 2019/11/28 at 10:41
 * @version 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(value = {TraceLog.class})
public @interface EnableTraceLog {
}
