package com.zpb.demos.springboot.service.impl;

import com.zpb.demos.springboot.entity.User;
import com.zpb.demos.springboot.mapper.UserMapper;
import com.zpb.demos.springboot.mapper.UserXmlMapper;
import com.zpb.demos.springboot.service.HelloService;
import com.zpb.demos.springboot.service.HelloXmlService;
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
public class HelloXmlServiceImpl implements HelloXmlService {

    @Resource
    private UserXmlMapper userXmlMapper;

    @Override
    public int getXmlAge(String name) {
        return userXmlMapper.getXmlAgeByName(name);
    }

    @Override
    public List<User> getXmlAllUsers() {
        return userXmlMapper.getXmlAllUsers();
    }


}
