package com.zpb.demos.springboot.controller;

import com.zpb.demos.springboot.service.Hello2Service;
import com.zpb.demos.springboot.service.Hello2ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Spring Boot + Caffeine 第一种集成方式
 *
 * Created by zhoupb on 23/06/2020.
 */
@Controller
public class Hello2Controller {

    @Autowired
    private Hello2Service hello2Service;

    @RequestMapping(value = "/hello2/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return hello2Service.sayHello(name);
    }
}
