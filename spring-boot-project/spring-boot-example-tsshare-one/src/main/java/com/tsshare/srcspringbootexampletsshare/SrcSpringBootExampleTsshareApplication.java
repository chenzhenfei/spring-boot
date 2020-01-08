package com.tsshare.srcspringbootexampletsshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication //<1>
@Configuration
public class SrcSpringBootExampleTsshareApplication {

	public static void main(String[] args) {
		//<2>
		SpringApplication.run(SrcSpringBootExampleTsshareApplication.class, args);
	}

}
