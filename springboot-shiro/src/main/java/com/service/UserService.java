package com.service;

import com.pojo.User;

/**
 * @ClassName: UserService
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/6 18:46
 * @Version 1.0
 **/
public interface UserService {
   public User queryUserByname(String username);
}
