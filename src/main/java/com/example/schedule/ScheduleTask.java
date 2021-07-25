package com.example.schedule;

import org.mortbay.log.Log;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
@EnableScheduling
public class ScheduleTask {

    @Scheduled(fixedDelay = 2000)
    public void task1() {
        Log.info("The current data (1) : " + LocalDateTime.now());

    }

    @Scheduled(fixedDelay = 2000)
    public void task2() {
        Log.info("The current data (2) : " + LocalDateTime.now());
    }
}
