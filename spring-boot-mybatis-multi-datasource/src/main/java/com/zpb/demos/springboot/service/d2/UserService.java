package com.zpb.demos.springboot.service.d2;

import com.zpb.demos.springboot.bean.User;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.service.d2
 * @Description:
 * @date 2020/7/4 18:11
 */
public interface UserService {

    User selectUserByName(String name);
}
