package com.zpb.demos.springboot.mapper;

import com.zpb.demos.springboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.mapper
 * @Description: 方式一
 * @date 2020/6/23 22:42
 */
public interface UserMapper {

    @Select("select name,age from user")
    List<User> getAllUsers();

    @Select("select age as a from user where name=#{name}")
    int getAgeByName(String name);
}
