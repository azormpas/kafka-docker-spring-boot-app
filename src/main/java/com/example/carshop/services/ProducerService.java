package com.example.carshop.services;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class ProducerService {

    private final static String TOPIC_NAME = "CAR_SHOP_TOPIC";
    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostConstruct
    public void init() {
        System.out.println("*********** Send ***********");
        List<String> list = Arrays.asList("Ena", "DUo", "tria", "tessera", "pente", "exi", "efta");
        sendMessage(list.toString());
        sendMessage("This is my first Kafka message ");
        sendMessage("This is my second Kafka message");
        sendMessage("This is my third Kafka message");
        sendMessage("This is my fourth Kafka message");
        sendMessage("This is my fifth Kafka message");
    }

    public void sendMessage(String msg) {
        kafkaTemplate.send(TOPIC_NAME, msg);
    }
}

