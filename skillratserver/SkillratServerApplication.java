package com.skillratserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SkillratServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillratServerApplication.class, args);
	}

}
