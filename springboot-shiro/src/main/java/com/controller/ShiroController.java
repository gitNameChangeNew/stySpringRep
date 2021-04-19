package com.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: ShiroController
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/6 17:09
 * @Version 1.0
 **/
@Controller
public class ShiroController {

    @RequestMapping({"/","/index"})
    public String toIndex(Model model){
        model.addAttribute("msg","hello shiro");
        return "index";
    }


    @RequestMapping(value = "/user/add")
    public String add(){
        return "user/add";
    }

    @RequestMapping(value = "/user/update")
    public String update(){
        return "user/update";
    }

    @RequestMapping(value = "/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/login")
    public String login(String username,String password,Model model){
        //设置当前用户
        Subject currentUser = SecurityUtils.getSubject();
        //封装用户登录数据
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
        try {
            currentUser.login(usernamePasswordToken);  //执行登录方法，如何没有异常，就说明登录成功
            return "index";
        } catch (UnknownAccountException e) {  //用户名不存在
            model.addAttribute("msg","用户名不存在或错误");
            return "login";
        } catch (IncorrectCredentialsException e) {  //密码错误
            model.addAttribute("msg","密码错误");
            return "login";
        }
    }
}
