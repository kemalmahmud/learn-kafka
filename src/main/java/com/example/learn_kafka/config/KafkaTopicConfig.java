package com.example.learn_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic testTopic() {
        return TopicBuilder.name("test").build();
    }

    @Bean
    public NewTopic createInputTopic() {
        return new NewTopic("input-topic", 3, (short) 1);
    }

    @Bean
    public NewTopic createOutputTopic() {
        return new NewTopic("output-topic", 3, (short) 1);
    }
}
