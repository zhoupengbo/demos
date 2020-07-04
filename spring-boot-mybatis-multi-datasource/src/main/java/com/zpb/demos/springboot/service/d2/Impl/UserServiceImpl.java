package com.zpb.demos.springboot.service.d2.Impl;

import com.zpb.demos.springboot.bean.User;
import com.zpb.demos.springboot.dao.d2.UserDao;
import com.zpb.demos.springboot.service.d2.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.service.d2.Impl
 * @Description:
 * @date 2020/7/4 18:12
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User selectUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
