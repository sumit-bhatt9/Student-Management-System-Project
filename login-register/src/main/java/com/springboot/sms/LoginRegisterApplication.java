 package com.springboot.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class LoginRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegisterApplication.class, args);
	}

}
