package org.wenhao.v9.service.impl;

import org.springframework.stereotype.Component;
import org.wenhao.v9.service.UserService;

@Component
public class MyUserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("MyUserServiceImpl");
    }
}
