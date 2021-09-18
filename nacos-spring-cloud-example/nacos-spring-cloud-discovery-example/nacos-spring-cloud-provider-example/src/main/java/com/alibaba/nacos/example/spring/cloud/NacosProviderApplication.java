package com.alibaba.nacos.example.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiaojing
 */
@SpringBootApplication
public class NacosProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosProviderApplication.class, args);
	}
}
