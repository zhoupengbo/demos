package com.zpb.demos.springboot.controller;

import com.zpb.demos.springboot.service.HelloService;
import com.zpb.demos.springboot.service.HelloServiceImpl;
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
public class HelloController {

    @Autowired
    private HelloServiceImpl helloService;

    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return helloService.sayHello(name);
    }
}
