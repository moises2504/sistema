package com.moisesferraz.sistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

@SpringBootApplication
public class SistemaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SistemaApplication.class, args);
	}
	@GetMapping("/")
	public String index(){
		return "ola";
	}


}
