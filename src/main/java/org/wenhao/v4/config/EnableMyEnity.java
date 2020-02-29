package org.wenhao.v4.config;

import org.springframework.context.annotation.Import;
import org.wenhao.v4.domain.MyEnity;

import java.lang.annotation.*;

/**
 * 之所以EnableXXX能生效 是因为再该注解中加入了 @Import(XXX.class),这时可以
 * 把相关配置类加载入spring ioc容器中进行使用了
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyEnity.class)
public @interface EnableMyEnity {
}
