package com.example.learn_kafka.Controller;

import com.example.learn_kafka.dto.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest) {
        kafkaTemplate.send("test", messageRequest.message());
    }

    @PostMapping("/uppercase")
    public String sendMessage(@RequestParam String message) {
        kafkaTemplate.send("input-topic", message);
        return "Message sent to Kafka: " + message;
    }
}
