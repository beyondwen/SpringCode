package org.wenhao.v2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wenhao.v2.config.SpringConfig;

public class TestSpring {

    private static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        System.out.println("加载配置文件开始。。。");
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("加载配置文件结束。。。");
        /*UserEnity userEnity = context.getBean("userEnity", UserEnity.class);
        System.out.println(userEnity.toString());
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
        /*UserService userService1 = context.getBean("userService", UserService.class);
        UserService userService2 = context.getBean("userService", UserService.class);
        System.out.println(userService1 == userService2);*/

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }
}
