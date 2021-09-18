package com.alibaba.nacos.example.spring.cloud;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class EchoController {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(@RequestBody User user) {
        return "Hello Nacos Discovery " + user.getName();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@RequestBody User user) {
        return "user create success. " + user.toString();
    }
}
