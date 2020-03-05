package com.mitocode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import pe.peru.OtroSpringBean;


@SpringBootApplication
@ComponentScan(basePackages = "com.mitocode")
@ComponentScan(basePackages = "pe.peru")
public class SpringbootIntroApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootIntroApplication.class);

	@Autowired(required = true) // inyectar el spring
	private SpringBean spring;
	
	@Autowired(required = true) // inyectar el spring
	private OtroSpringBean otrospring;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootIntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Aplicacion Iniciada");
		logger.info("Hascode Bean:" + spring.hashCode());
//		SpringBean instancia = new SpringBean();
//		logger.info("Nueva Instancia:" + instancia.hashCode());

		logger.info("OtroSprean" + otrospring.hashCode());

	}

}
