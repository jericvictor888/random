package com.random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.random.enums.Season;

@SpringBootApplication
public class EnumDemoApplication implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(EnumDemoApplication.class);
	
	public static void main(String[] args){
		SpringApplication.run(EnumDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Season season = Season.WINTER;  
		log.info("season.getValue() : {}", season.getValue());
		log.info("season.ordinal() {}", season.ordinal());
		log.info("season.name() {}", season.name());
		
		Season season2 = Season.valueOf("SUMMER"); 
		log.info("season2.name() {}", season2.name());
		log.info("season2.toString() {}", season2.toString());
		
	}
}
