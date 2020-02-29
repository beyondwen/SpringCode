package org.wenhao.v3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wenhao.v3.config.MyConfig;
import org.wenhao.v3.enity.Win10Enity;

public class TestSpring {

    private static AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(MyConfig.class);
        Win10Enity win10Enity = (Win10Enity) context.getBean("win10Enity");
        System.out.println(win10Enity);
    }
}
