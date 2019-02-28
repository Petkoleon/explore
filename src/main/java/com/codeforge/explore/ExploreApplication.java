package com.codeforge.explore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ExploreApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExploreApplication.class, args);
		log.info("INFO: Application is running...");
		log.warn("WARN: Application is running...");
		log.error("ERROR: Application is running...");
		log.debug("DEBUG: Application is running...");
		log.trace("TRACE: Application is running...");
	}

}
