package com.service.impl;

import com.service.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: UserServiceImpl
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/3/30 11:16
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {

    public Map addUser() {
        System.out.println("add user");
        Map map = new HashMap();
        Map map2 = new HashMap();
        map2.put("httpResult","接口正确返回");
        map.put("X_RESULTCODE","0");
        map.put("RESULTINFO","返回信息");
        map.put("INTERFACEINFO",map2);
        return map;
    }
}
