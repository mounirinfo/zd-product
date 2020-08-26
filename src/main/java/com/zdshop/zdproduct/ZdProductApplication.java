package com.zdshop.zdproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZdProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZdProductApplication.class, args);
	}

}
