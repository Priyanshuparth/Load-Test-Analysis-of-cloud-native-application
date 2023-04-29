package com.springhpesync2.springhpesync2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Springhpesync2Application {

	@RestController
    public class SyncController2 {
        
        @GetMapping("/sync2")
        public String syncMethod2() {
            return "Response from Sync Application 2";
        }
    }
	public static void main(String[] args) {
		SpringApplication.run(Springhpesync2Application.class, args);
	}

}
