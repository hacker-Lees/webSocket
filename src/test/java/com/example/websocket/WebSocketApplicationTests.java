package com.example.websocket;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebSocketApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test1(){
        AtomicInteger at = new AtomicInteger(4);

        Map map = new ConcurrentHashMap();
    }
}
