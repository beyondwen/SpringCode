package org.wenhao.v7.config;

import org.springframework.beans.factory.FactoryBean;
import org.wenhao.v7.domain.MyEnity;

public class MyFactoryBean implements FactoryBean<MyEnity> {

    @Override
    public MyEnity getObject() throws Exception {
        return new MyEnity();
    }

    @Override
    public Class<?> getObjectType() {
        return MyEnity.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
