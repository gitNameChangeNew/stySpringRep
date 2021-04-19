package com.aspert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName: TradeLogHandle
 * @Description：
 *  申明当前类是一个切面
 *  切面的组成：切入点 +通知的一个抽象
 *
 *  切入点：定义要拦截 哪些类的哪些方法
 *  通知： 定义拦截后方法需要干的事情
 *
 * @author: Administrator
 * @Date 2021/3/11 14:47
 * @Version 1.0
 **/
@Component
@Aspect
public class TradeLogHandle {

    /**
     * @Description
     * 申明切入点
     *  定义要拦截 哪些类的哪些方法
     *  匹配规则 拦截哪些方法
     *
     *  execution(* com.service.*.*(..))
     *  第一个 *  代表被拦截方法的修饰符    public private  protected 修饰符  * 表示所有的范围
     *
     *  com.*.*.*   com.* 包下的所有类的所有方法的所有参数  指定某个方法
     *
     *  指定包以及子包下的所有方法
     *  execution(* com.service..*.*(..))
     *
     * @Author Administrator
     * @return void
     * @throws
     * @Date 2021/3/11 14:58
     */
    @Pointcut("execution(* com.service..*.*(..))")
    public void cut(){

    }

    @Before(value = "cut()")
    public void before(){
        System.out.println("\"方法执行前执行了\" = " + "方法执行前执行了");
    }



}
