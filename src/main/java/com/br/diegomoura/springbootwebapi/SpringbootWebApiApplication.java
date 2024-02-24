package com.br.diegomoura.springbootwebapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Users API REST", version = "1.0", description = "Users Information"))
public class SpringbootWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApiApplication.class, args);
	}
}
