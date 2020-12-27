package com.example.tasks.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    @Scheduled(cron = "0 * * * * ?")
    public void hello(){
        System.out.println("hello, executed...");
    }
}
