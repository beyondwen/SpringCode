package org.wenhao.v3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wenhao.v3.config.MyConfig;
import org.wenhao.v3.enity.Win10Enity;

public class TestSpring {

    private static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(MyConfig.class);
        //Win10Enity win10Enity = (Win10Enity) context.getBean("win10Enity"); 使用@bean注解时，采用该种方法
        Win10Enity win10Enity = (Win10Enity) context.getBean("org.wenhao.v3.enity.Win10Enity"); //使用@import时采用的方法
        System.out.println(win10Enity);
    }
}
