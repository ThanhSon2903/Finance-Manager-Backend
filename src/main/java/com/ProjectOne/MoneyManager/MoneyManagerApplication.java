package com.ProjectOne.MoneyManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.ProjectOne.MoneyManager")
public class MoneyManagerApplication {

	public static void main(String[] args) {
		System.out.println("BACKEND_URL = " + System.getenv("MONEY_MANAGER_BACKEND_URL"));
		SpringApplication.run(MoneyManagerApplication.class, args);
	}

}
