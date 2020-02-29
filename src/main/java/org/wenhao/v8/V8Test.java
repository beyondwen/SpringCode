package org.wenhao.v8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wenhao.v8.config.MyConfig;

public class V8Test {
    static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
