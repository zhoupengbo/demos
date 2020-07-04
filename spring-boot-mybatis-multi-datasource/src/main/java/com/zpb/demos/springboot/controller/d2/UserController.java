package com.zpb.demos.springboot.controller.d2;

import com.zpb.demos.springboot.bean.User;
import com.zpb.demos.springboot.service.d2.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.controller.d2
 * @Description:
 * @date 2020/7/4 18:10
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public User testQuery() {
        return userService.selectUserByName("zhou");
    }
}
