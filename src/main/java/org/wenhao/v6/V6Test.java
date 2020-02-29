package org.wenhao.v6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wenhao.v6.config.MyConfig;

public class V6Test {
    static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
