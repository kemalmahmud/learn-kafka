package com.example.learn_kafka;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class LearnKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnKafkaApplication.class, args);
	}

	@Bean // buat testing aja, bakal di run ketika aplikasi di start
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send("test", "hello kafka");
		};
	}

}
