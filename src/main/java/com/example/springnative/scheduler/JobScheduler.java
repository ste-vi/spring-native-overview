package com.example.springnative.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class JobScheduler {

    @Scheduled(fixedRate = 10000, initialDelay = 10000)
    public void executeTask() {
        log.info("Scheduler task executed at: {}", LocalDateTime.now());
    }
}
