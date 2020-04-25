package org.wenhao.v9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class V9Test {
    static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        /*context = new AnnotationConfigApplicationContext(MyConfig.class);
        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) context.getBean("orderServiceImpl");
        orderServiceImpl.add();*/
        context = new AnnotationConfigApplicationContext();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
