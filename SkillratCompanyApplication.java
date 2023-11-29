package com.skillratcompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.skillratcompany" })
@EntityScan(basePackages = { "com.skillratcompany" })
@ComponentScan(basePackages = { "com.skillratcompany" })
public class SkillratCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillratCompanyApplication.class, args);
	}

}
