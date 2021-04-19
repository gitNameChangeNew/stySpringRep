package com.jdk;

import com.service.UserService;
import com.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: TestJDKProxy
 * @Description：jdk动态代理
 * @author: Administrator
 * @Date 2021/3/30 11:15
 * @Version 1.0
 **/
public class TestJDKProxy {

    public static void main(String[] args) {
        //创建原始对象
        final UserService userService = new UserServiceImpl();

        //jdk创建动态代理
        /*  代理创建 原始对象  额外功能  代理对象和原始对象实现相同的接口
         *  ClassLoader loader,     userService.getClass().getClassLoader();
         *          类加载的作用 通过类加载器把对应类的字节码文件加载到虚拟机
         *                     通过类加载器创建加载进虚拟机对象类的 Class对象，Class对象记录的所有信息，进而再创建这个类的对象
         * 获得类加载器的方式: 虚拟机为每一个类的.class文件，自动分配与之对应的ClassLoader
         * 动态代理创建过程中， 动态代理类没有.java类 和.class文件  需要采用动态字节码技术来创建字节码的，直接将字节码写入到虚拟机内部
         *  jdk 使用 Proxy.newProxyInstance( classLoader，interfaces,invocationHandler) 第二个参数interfaces，第三个参数invocationHandler，将字节码写入到虚拟机内部
         * 创建代理类的对象，需要获得代理类的Class对象 ，这里就需要类加载器来创建Class对象 。
         *  动态代理类因为没有.class文件，虚拟机无法分配到ClassLoader
         *  在动态代理创建的过程中，需要ClassLoader 创建代理类对应的Class对象，只能借用ClassLoader
         *  因此jdk 使用 Proxy.newProxyInstance(classLoader, interfaces,invocationHandler)
         *                              第一个参数classLoader 就为借用的classLoader 完成代理类的创建
         *
         *
         *  Class<?>[] interfaces,  userService.getClass().getInterfaces()
         *  InvocationHandler h
         */
        InvocationHandler invocationHandler = new InvocationHandler() {
            //proxy  代理对象
            //method 原始对象的方法
            //args   原始对象方法的参数
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("方法执行前操作下。。。。");

                //原始对象的返回值
                Object ret = method.invoke(userService, args);
                System.out.println(ret);
                System.out.println("方法执行后操作下。。。。");
                return ret;
            }
        };

        ClassLoader loader = userService.getClass().getClassLoader();
        Class<?>[] interfaces = userService.getClass().getInterfaces();

        UserService serviceProxy = (UserService) Proxy.newProxyInstance(loader, interfaces, invocationHandler);
        serviceProxy.addUser();
    }
}
