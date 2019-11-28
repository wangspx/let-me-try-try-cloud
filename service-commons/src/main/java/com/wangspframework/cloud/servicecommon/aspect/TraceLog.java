package com.wangspframework.cloud.servicecommon.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author spwang Created on 2019/11/28 at 10:36
 * @version 1.0.0
 */
@Aspect
public class TraceLog {
    private static final Logger LOGGER = LoggerFactory.getLogger(TraceLog.class);

    @Pointcut("execution(* com.wangsp.cloud..*.*(..))")
    public void point(){
    }

    @Around("point()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = pjp.proceed();
        long endTime = System.currentTimeMillis();
        String method = pjp.getSignature().getDeclaringTypeName() + "#" + pjp.getSignature().getName();
        String args = Arrays.toString(pjp.getArgs());
        String executeTime = (endTime - startTime) + "ms";
        LOGGER.info("ClassMethod: [{}] args: [{}] result: [{}] execute time: [{}]", method, args, result, executeTime);
        return result;
    }
}
