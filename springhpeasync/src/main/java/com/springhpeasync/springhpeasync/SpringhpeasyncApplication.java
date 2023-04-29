package com.springhpeasync.springhpeasync;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringhpeasyncApplication {

	 @RestController
	    public class AsyncController {

	        @Autowired
	        private AsyncService asyncService;

	        @GetMapping("/async")
	        public CompletableFuture<String> asyncMethod() {
	            return asyncService.getAsyncResponse();
	        }
	    }

	 public static void main(String[] args) {
			SpringApplication.run(SpringhpeasyncApplication.class, args);
		}
	 
	    @Service
	    public class AsyncService {

	        @Async
	        public CompletableFuture<String> getAsyncResponse() {
	            try {
	                // Perform some long-running task
	                Thread.sleep(5000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            return CompletableFuture.completedFuture("Response from AsyncService1");
	        }
	    }
	

}
