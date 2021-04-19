package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserMapper
 * @Description：TODO
 * @author: Administrator
 * @Date 2021/4/6 18:42
 * @Version 1.0
 **/
@Repository
@Mapper
public interface UserMapper {

    public User queryUserByname(String username);
}
