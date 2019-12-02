package com.wangspframework.cloud.servicebaseframe.starter;

import com.wangspframework.cloud.servicebaseframe.BaseServiceFrameApplication;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author spwang Created on 2019/12/2 at 10:47
 * @version 1.0.0
 */
public class ImportBaseServiceBeanRegistrar implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {BaseServiceFrameApplication.class.getName()};
    }
}
