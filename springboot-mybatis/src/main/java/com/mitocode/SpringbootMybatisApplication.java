package com.mitocode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootMybatisApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(SpringbootMybatisApplication.class);

	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
