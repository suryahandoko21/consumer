package com.api.consumer.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
     @KafkaListener(topics = "uploadFile", groupId = "group_id")
    public void consume(String message)
    {
        System.out.println("------------------------------------------------------------------------");
        System.out.println(">>>> message stream from kafka topic uploadFile <<<< " + message);
        System.out.println("------------------------------------------------------------------------");
    }
}
