package com.service;

import com.entity.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/3/22 16:24
 * @Version 1.0
 **/
public interface UserService {
    public void register(User user);

    public List<User> getUserList();
}
