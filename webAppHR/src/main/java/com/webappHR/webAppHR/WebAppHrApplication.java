package com.webappHR.webAppHR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebAppHrApplication  implements CommandLineRunner {
    
    @Autowired
    private CustomProperties props;

	public static void main(String[] args) {
		SpringApplication.run(WebAppHrApplication.class, args);
	}

    @Override
    public void run( String... args ) throws Exception {
        System.out.println("API: "+props.getApiUrl());
        
    }

}
