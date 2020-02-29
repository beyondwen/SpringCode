package org.wenhao.v9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wenhao.v9.config.MyConfig;
import org.wenhao.v9.service.impl.OrderServiceImpl;

public class V9Test {
    static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(MyConfig.class);
        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) context.getBean("orderServiceImpl");
        orderServiceImpl.add();
    }
}
