package com.example.flume;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class FlumeTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlumeTest.class);

    @Test
    public void contextLoads() {
        for(int i = 1 ; i < 10 ; i++) {
            LOGGER.info("flume :  " + i);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
