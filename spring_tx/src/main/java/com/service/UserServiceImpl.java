package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/3/22 16:26
 * @Version 1.0
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;



    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void register(User user) {
        userDao.save(user);
    }

    public List<User> getUserList() {
        return  userDao.getUserList();
    }
}
