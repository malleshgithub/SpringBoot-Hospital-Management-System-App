package com.my.springjwt;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityJwtApplication {
	 private static final Logger LOGGER = LogManager.getLogger(SpringBootSecurityJwtApplication.class);
	public static void main(String[] args) {
	    SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	    LOGGER.info("Boot Started");
		}
}
