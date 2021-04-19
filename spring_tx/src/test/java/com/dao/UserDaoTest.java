package com.dao;

import com.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * @ClassName: UserDaoTest
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/3/24 11:01
 * @Version 1.0
 **/
public class UserDaoTest {

    @Test
    public void test() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setusername("testMybatis");
        user.setSex("1");
        user.setBirthday(new Date());
        userDao.save(user);
        sqlSession.commit();
    }
}
