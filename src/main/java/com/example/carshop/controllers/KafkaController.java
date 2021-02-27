package com.example.carshop.controllers;


import com.example.carshop.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private ProducerService producerService;

    private int counter = 0;

    @GetMapping("/send")
    public void sendDataToTopic() {
        counter++;
        producerService.sendMessage("Message  :  " + counter);
    }
}
