package org.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import org.example.config.RepositoriesConfigurator;
import org.example.controllers.ProductController;

@SpringBootApplication
@Import({ProductController.class, RepositoriesConfigurator.class})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}