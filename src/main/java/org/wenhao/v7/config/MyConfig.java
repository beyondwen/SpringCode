package org.wenhao.v7.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyFactoryBean.class)
public class MyConfig {
}
