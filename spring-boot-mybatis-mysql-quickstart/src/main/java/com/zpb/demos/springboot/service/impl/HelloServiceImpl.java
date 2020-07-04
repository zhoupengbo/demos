package com.zpb.demos.springboot.service.impl;

import com.zpb.demos.springboot.entity.User;
import com.zpb.demos.springboot.mapper.UserMapper;
import com.zpb.demos.springboot.mapper.UserXmlMapper;
import com.zpb.demos.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.mybatis.mysql.quickstart.service.impl
 * @Description:
 * @date 2020/6/23 16:03
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int getAge(String name) {
        return userMapper.getAgeByName(name);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = userMapper.getAllUsers();
        return allUsers;
    }

}
