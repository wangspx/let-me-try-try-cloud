package com.wangsp.cloud.servicecommon;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spwang Created on 2019/11/27 at 9:20
 * @version 1.0.0
 */
@FunctionalInterface
public interface EntityFactory<T> {
    default List<T> converts(List<Object> list) {
        List<T> elements = new ArrayList<>();
        for (Object o : list) {
            elements.add(this.convert(o));
        }
        return elements;
    }

    T convert(Object t);
}
