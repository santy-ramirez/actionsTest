package com.santiago.actiongithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActiongithubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiongithubApplication.class, args);
	}
	@GetMapping("/helloworld")
	public String hello() {
		return"Hello World! amazon web service2";
	}

	}
	@GetMapping("/")
	public String helloAws() {
		return"Hello World! amazon aws Elastic Beanstalk";
	}

}
