package io.medical.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	// http://localhost:8080/request-param?name=namehere
	@GetMapping("/request-param")
	public String requestParam(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}


	// http://localhost:8080/path-variable/2
	@GetMapping("/path-variable/{name}")
	public String pathVariable(@PathVariable("name") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/")
	public String greetings() {
		return String.format("Greetings!");
	}

}
