package com.example.learn_kafka;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.*;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "test", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received : " + data);
    }
}
