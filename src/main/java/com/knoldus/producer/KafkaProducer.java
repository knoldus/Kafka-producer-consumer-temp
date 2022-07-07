package com.knoldus.producer;

import com.knoldus.entity.User;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public class KafkaProducer {
    private final KafkaTemplate kafkaTemplate;

    public KafkaProducer(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(List<User> user) {
        kafkaTemplate.send("knoldus", user);
    }
}
