package com.knoldus;

//import com.knoldus.entity.User;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaConsumerApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private KafkaConsumer consumer;

    @Autowired
    private KafkaProducer producer;

    private String topic = "knoldus";

    @Test
    public void givenEmbeddedKafkaBroker_whenSendingWithSimpleProducer_thenMessageProduced()
            throws Exception {
        List<User> data = new ArrayList();
        data.add(new User(1,"Prem"));
        data.add(new User(2,"Manish"));
        data.add(new User(3,"Jason"));
        data.add(new User(4,"Smith"));
        data.add(new User(5,"John"));
        producer.sendMessage(data);
        System.out.println("data=========" +data);
    }
}