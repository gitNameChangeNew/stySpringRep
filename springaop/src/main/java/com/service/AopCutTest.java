package com.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName: AopCutTest
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/3/12 14:36
 * @Version 1.0
 **/
@Service
public class AopCutTest {

    public void cutTest(){
        System.out.println(" cutTest....");
    }

    public void cutTest2(){
        System.out.println(" cutTest2....");
    }
}


