package com.alibaba.nacos.example.spring.cloud;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private FeignUserService userService;

    @Autowired
    public UserController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(@RequestParam User user) {
        Map<String, Object> variableMap = new HashMap<>();
        variableMap.put("name", user.getName());
        Gson gson = new Gson();
        String variables = gson.toJson(variableMap);
        return restTemplate.getForObject("http://service-provider/echo", String.class, variables);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@RequestBody User user) {
        return userService.create(user);
    }
}
