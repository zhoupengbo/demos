package com.zpb.demos.springboot.controller;

import com.zpb.demos.springboot.entity.User;
import com.zpb.demos.springboot.service.HelloService;
import com.zpb.demos.springboot.service.HelloXmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhoupb
 * @Package com.zpb.demos.springboot.controller
 * @Description:
 * @date 2020/6/23 16:50
 */

@Controller
@RequestMapping("/xml/user")
public class HelloXmlController {

    @Autowired
    private HelloXmlService helloXmlService;

    @ResponseBody
    @GetMapping("/{name}/age")
    public int getAge(@PathVariable String name){

        return helloXmlService.getXmlAge(name);
    }

    @ResponseBody
    @GetMapping("/all")
    public List<User> getUser(){
        return helloXmlService.getXmlAllUsers();
    }
}
