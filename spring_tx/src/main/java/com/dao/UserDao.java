package com.dao;

import com.entity.User;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/3/24 10:40
 * @Version 1.0
 **/
public interface UserDao {

    public void save(User user);

    public List<User> getUserList();

}
