package org.wenhao.v2.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wenhao.v1.enity.UserEnity;
import org.wenhao.v2.config.SpringConfig;
import org.wenhao.v2.service.UserService;

public class TestSpring {

    private static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        /*UserEnity userEnity = context.getBean("userEnity", UserEnity.class);
        System.out.println(userEnity.toString());
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
        UserService userService1 = context.getBean("userService", UserService.class);
        UserService userService2 = context.getBean("userService", UserService.class);
        System.out.println(userService1 == userService2);

    }
}
