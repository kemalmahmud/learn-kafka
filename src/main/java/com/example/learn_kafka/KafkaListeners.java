package com.example.learn_kafka;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.*;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "test", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received : " + data);
    }

    @KafkaListener(topics = "output-topic", groupId = "group-id")
    public void listen(String message) {
        System.out.println("Received from output-topic: " + message);
    }
}
