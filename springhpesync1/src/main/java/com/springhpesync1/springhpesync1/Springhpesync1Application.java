package com.springhpesync1.springhpesync1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Springhpesync1Application {

	@RestController
    public class SyncController1 {
        
        @GetMapping("/sync1")
        public String syncMethod1() {
            return "Response from Sync Application 1";
        }
    }
	public static void main(String[] args) {
		SpringApplication.run(Springhpesync1Application.class, args);
	}

}
