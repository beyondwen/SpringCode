package org.wenhao.v9.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.wenhao.v9.service.UserService;

@Component
public class OrderServiceImpl {

    @Autowired //默认使用类型查找 //@Resource(name = "youUserServiceImpl") 按名称
    //@Qualifier(value = "myUserServiceImpl")  通过指定 bean 来注入
    // 或者通过 @Primary 在实现类中通过优先级来指定
    private UserService userService;

    public void add() {
        userService.add();
    }
}
