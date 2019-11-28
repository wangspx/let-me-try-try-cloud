package com.wangsp.cloud.servicecommon;

public class ServiceCommonApplication {

    public static void main(String[] args) {
        EntityFactory entityFactory = new EntityFactory() {
            @Override
            public Object convert(Object t) {
                return null;
            }
        };
        Object sss = entityFactory.convert("sss");
    }

}
