package com.sty;

import com.aspert.TradeLogHandle;
import com.service.AopCutTest;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestSpringAop
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/3/12 14:39
 * @Version 1.0
 **/
public class TestSpringAop {

    @Test
    public void test(){
        //spring工厂创建的对象叫做bean或commpant
        //初始化工厂的时候，已经将bean创建 使用默认构造方法
        //1.获得spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //TradeLogHandle tradeLogHandle = (TradeLogHandle) applicationContext.getBean("tradeLogHandle");
        AopCutTest aopCutTest = (AopCutTest) applicationContext.getBean("aopCutTest");
        aopCutTest.cutTest();
        aopCutTest.cutTest2();
    }
}
