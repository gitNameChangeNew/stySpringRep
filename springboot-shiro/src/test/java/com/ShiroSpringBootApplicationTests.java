package com;

import com.pojo.User;
import com.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

/**
 * @ClassName: ShiroSpringBootApplicationTests
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/6 18:49
 * @Version 1.0
 **/
@SpringBootTest
public class ShiroSpringBootApplicationTests {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void contextLoads(){
        User user = userService.queryUserByname("毛蛋");
        System.out.println(user);
    }
}
