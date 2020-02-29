package org.wenhao.v7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wenhao.v7.config.MyConfig;
import org.wenhao.v7.domain.MyEnity;

public class V7Test {
    static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyEnity MyEnity1 = (MyEnity) context.getBean("org.wenhao.v7.config.MyFactoryBean");
        MyEnity MyEnity2 = (MyEnity) context.getBean("org.wenhao.v7.config.MyFactoryBean");
        System.out.println(MyEnity1 == MyEnity2);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
