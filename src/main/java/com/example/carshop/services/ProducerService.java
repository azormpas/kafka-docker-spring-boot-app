package com.example.carshop.services;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProducerService {

    private final static String TOPIC_NAME = "CAR_SHOP_TOPIC";
    private final KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(String msg) {
        kafkaTemplate.send(TOPIC_NAME, msg);
    }
}

