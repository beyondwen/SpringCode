package org.wenhao.v4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wenhao.v4.config.MyConfig;

public class V4Test {


    public static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
