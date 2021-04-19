package com.sty.basic;

import java.util.Date;

/**
 * @ClassName: Person
 * @Description：用户类
 * @author: Administrator
 * @Date 2021/1/12 14:26
 * @Version 1.0
 **/
public class Person {
    private int id;
    private String name;
    private Date birthday;

    public Person() {
        System.out.println("Person 默认构造函数执行了。。。。");
    }


    public Person(int id, String name, Date birthday) {
        System.out.println("Person 全参数构造函数执行了。。。。");
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}
