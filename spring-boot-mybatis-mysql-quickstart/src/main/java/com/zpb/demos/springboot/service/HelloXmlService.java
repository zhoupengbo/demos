package com.zpb.demos.springboot.service;

import com.zpb.demos.springboot.entity.User;

import java.util.List;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.mybatis.mysql.quickstart.service
 * @Description:
 * @date 2020/6/23 16:03
 */
public interface HelloXmlService {

    int getXmlAge(String name);
    List<User> getXmlAllUsers();
}
