package org.wenhao.v3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.wenhao.v3.enity.Win10Enity;

/**
 * @Import 等同于  @Bean 但是两者还是有所区别的  @Import 再获取时，需要使用全限定名
 * 而@bean 可以直接通过方法名获取对象
 * 共同的应用场景都是引入外部jar包
 */

@Configuration
@Import(Win10Enity.class)
public class MyConfig {

    /*@Bean
    @Conditional(MyCondtion.class)
    public Win10Enity win10Enity() {
        return new Win10Enity();
    }*/
}
