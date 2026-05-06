package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	        Dotenv dotenv = Dotenv.configure()
                            .ignoreIfMissing()
                            .load();
 
 
                for (DotenvEntry entry : dotenv.entries()) {
                        System.setProperty(entry.getKey(), entry.getValue());
                }


        SpringApplication.run(DemoApplication.class, args);
	}

}
