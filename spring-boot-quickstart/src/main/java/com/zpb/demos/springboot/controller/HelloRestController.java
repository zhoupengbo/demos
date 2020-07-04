package com.zpb.demos.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Hello案例
 *
 * Created by zhoupb on 23/06/2020.
 */
@RestController
public class HelloRestController {

    @RequestMapping(value = "/rest/hello",method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, springboot ! This is a restful interface!";
    }
}
