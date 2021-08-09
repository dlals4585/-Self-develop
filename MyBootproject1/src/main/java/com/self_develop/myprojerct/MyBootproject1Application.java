package com.self_develop.myprojerct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.self_develop.myprojerct"})
//@EntityScan("com.self_develop.myprojerct.domain")
public class MyBootproject1Application {

	public static void main(String[] args) {
		SpringApplication.run(MyBootproject1Application.class, args);
	}

}
