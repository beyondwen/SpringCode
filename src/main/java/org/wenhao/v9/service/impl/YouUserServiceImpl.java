package org.wenhao.v9.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.wenhao.v9.service.UserService;

@Component
@Primary
public class YouUserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("YouUserServiceImpl");
    }
}
