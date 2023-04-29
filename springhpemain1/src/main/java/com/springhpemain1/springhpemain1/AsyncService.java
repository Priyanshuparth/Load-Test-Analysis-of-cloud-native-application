package com.springhpemain1.springhpemain1;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

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
        return CompletableFuture.completedFuture("Response from AsyncService");
    }
}
