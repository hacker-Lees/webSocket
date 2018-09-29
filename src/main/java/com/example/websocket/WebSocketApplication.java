package com.example.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hunNan
 */
@Slf4j
@SpringBootApplication
public class WebSocketApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WebSocketApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("启动成功！");
    }
}
