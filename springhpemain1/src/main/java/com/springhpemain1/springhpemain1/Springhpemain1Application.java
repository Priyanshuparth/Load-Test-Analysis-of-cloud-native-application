package com.springhpemain1.springhpemain1;

import java.util.concurrent.CompletableFuture;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@SpringBootApplication

public class Springhpemain1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springhpemain1Application.class, args);
	}
	@RestController
	public class MainController {

	    @Autowired
	    private RestTemplate restTemplate;

	    @Autowired
	    private AsyncService asyncService;

	    @GetMapping("/main")
	    public CompletableFuture<String> mainMethod() {
	        String sync1Response = restTemplate.getForObject("http://localhost:8081/sync1", String.class);
	        String sync2Response = restTemplate.getForObject("http://localhost:8082/sync2", String.class);

	        CompletableFuture<String> async1Result = asyncService.getAsyncResponse()
	            .thenApply(async1Response -> {
	                System.out.println("Async Application returned: " + async1Response);
	                return async1Response;
	            })
	            .exceptionally(ex -> {
	                System.out.println("Async Application threw an exception: " + ex.getMessage());
	                return "Error occurred while getting response from Async Application";
	            });

	        return CompletableFuture.completedFuture(sync1Response + " " + sync2Response)
	            .thenCombine(async1Result, (syncResponses, asyncResponse) -> {
	                return syncResponses + " " + asyncResponse;
	            });
	    }
	}
    
    
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
