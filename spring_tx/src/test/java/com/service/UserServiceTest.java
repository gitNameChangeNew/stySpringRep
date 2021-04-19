package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName: UserServiceTest
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/3/24 12:25
 * @Version 1.0
 **/
public class UserServiceTest {

    //spring 与mybatis的整合 测试userDao
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }


    //spring 与mybatis的整合 测试userService
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        List<User> userList = userServiceImpl.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
