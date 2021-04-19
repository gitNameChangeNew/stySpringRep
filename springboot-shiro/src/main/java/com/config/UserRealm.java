package com.config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

/**
 * @ClassName: UserRealm
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/6 17:26
 * @Version 1.0
 **/
public class UserRealm extends AuthorizingRealm {

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权");
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了认证");

        String username = "root";
        String password = "admin";
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;

        if(!username.equals(usernamePasswordToken.getUsername())){
            //抛出异常UnknownAccountException
            return null;
        }
        //默认自动认证密码
        return new SimpleAuthenticationInfo("",password,"");
    }
}
