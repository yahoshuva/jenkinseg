package com.jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsegApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsegApplication.class);


	@PostConstruct
	public void init(){
		System.out.println("Application Started...");
	}

	public static void main(String[] args) {


		logger.info("Application executed..");
		SpringApplication.run(JenkinsegApplication.class, args);

	}

}
