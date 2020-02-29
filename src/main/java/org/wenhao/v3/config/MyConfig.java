package org.wenhao.v3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.wenhao.v3.enity.Win10Enity;

@Configuration
public class MyConfig {

    @Bean
    @Conditional(MyCondtion.class)
    public Win10Enity win10Enity() {
        return new Win10Enity();
    }
}
