package org.wenhao.v1.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wenhao.v1.enity.UserEnity;

public class TestSpring {


    private static ClassPathXmlApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserEnity userEnity = applicationContext.getBean("userEnity", UserEnity.class);
        System.out.println(userEnity.toString());
    }
}
