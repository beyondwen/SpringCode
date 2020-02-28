package org.wenhao.v2.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype") 多实例
@Scope("singleton") //单例
public class UserService {
}
