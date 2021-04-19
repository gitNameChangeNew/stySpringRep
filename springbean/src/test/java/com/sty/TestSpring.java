package com.sty;

import com.sty.basic.Person;
import com.sty.basic.UserService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: TestSpring
 * @Description：测试spring 工厂
 * @author: Administrator
 * @Date 2021/1/12 14:25
 * @Version 1.0
 **/
public class TestSpring {

    @Test
    public void test(){
        //spring工厂创建的对象叫做bean或commpant
        //初始化工厂的时候，已经将bean创建 使用默认构造方法
        //1.获得spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //2.从工厂中获取对象
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);

        /*UserService userService = (UserService)applicationContext.getBean("userServiceImpl");
        System.out.println(userService);*/
    }

    @Test
    public void test2(){
        //spring 工厂的的常用方法
        //1.获得spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    }


    @Test
    public void test3(){
        //spring 工厂的的常用方法
        //1.获得spring工厂
        //  <bean  class="com.sty.basic.Person"></bean> 配置文件中配置的代码  id的默认值 com.sty.basic.Person#0
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String beanDefinitionName:beanDefinitionNames){
            System.out.println(beanDefinitionName);
        }

    }


    @Test
    public void test4(){



    }







}
