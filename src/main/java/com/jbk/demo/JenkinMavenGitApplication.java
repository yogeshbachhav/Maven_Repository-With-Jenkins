package com.jbk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinMavenGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinMavenGitApplication.class, args);
	}

	@RequestMapping("/Hello")
	public String welcome() {
		return ("Welcome to Spring Boot");
	}
}
