package org.wenhao.v2.service;

import org.springframework.stereotype.Service;

@Service
//@Scope("prototype") 多实例
//@Scope("singleton") //单例
//@Lazy(value = false)//延迟加载 为false 为饿汉式，true 懒汉式
public class UserService {
    public UserService() {
        System.out.println("初始化UserService");
    }
}
