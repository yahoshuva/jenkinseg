package com.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsegApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinsegApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Test case executing..");
		logger.info("Test case executing second...");
		assertEquals(true,true);
	}

}
