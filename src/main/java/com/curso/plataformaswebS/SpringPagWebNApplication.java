package com.curso.plataformaswebS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringPagWebNApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPagWebNApplication.class, args);
	}

}
