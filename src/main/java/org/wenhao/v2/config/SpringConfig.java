package org.wenhao.v2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;
import org.wenhao.v1.enity.UserEnity;

/**
 * 此处的 Configuration 如同 applicationContext.xml 配置文件
 */

@Configuration
//包含
/*@ComponentScan(value = "org.wenhao.v2", includeFilters =
        {@ComponentScan.Filter
                (type = FilterType.ANNOTATION, classes = Service.class)}, useDefaultFilters = false)*/
//不包含
@ComponentScan(value = "org.wenhao.v2",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = Service.class)}, useDefaultFilters = true)
public class SpringConfig {

    /**
     * 只有将外部的类加载到spring 容器 才使用 @bean
     *
     * @return
     */
    @Bean
    public UserEnity userEnity() {
        return new UserEnity("123", "lisi");
    }
}
