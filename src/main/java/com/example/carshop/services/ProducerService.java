package com.example.carshop.services;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@AllArgsConstructor
public class ProducerService {

    private final static String TOPIC_NAME = "CAR_SHOP_TOPIC";
    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostConstruct
    public void init() {
        sendMessage("This is my first Kafka message");
    }

    public void sendMessage(String msg) {
        kafkaTemplate.send(TOPIC_NAME, msg);
    }
}

