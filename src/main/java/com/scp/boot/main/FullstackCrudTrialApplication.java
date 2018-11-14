package com.scp.boot.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.scp.boot.model.Employee;
import com.scp.boot.service.EmployeeRepository;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.scp.boot.service")
@EntityScan("com.scp.boot.model")
@ComponentScan({"com.scp.boot.controller"})
public class FullstackCrudTrialApplication implements CommandLineRunner{
	@Autowired
	EmployeeRepository empRepos;
	public static void main(String[] args) {
		SpringApplication.run(FullstackCrudTrialApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//just tested some code here
	}
}
