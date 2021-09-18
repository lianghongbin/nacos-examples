package com.alibaba.nacos.example.spring.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-provider")
public interface FeignUserService {

    @GetMapping("/create")
    String create(User user);
}
