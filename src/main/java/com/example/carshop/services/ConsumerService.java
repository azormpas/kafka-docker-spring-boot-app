package com.example.carshop.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {


    private final static String TOPIC_NAME = "CAR_SHOP_TOPIC";


    @KafkaListener(topics = TOPIC_NAME, groupId = "GROUP_1")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
