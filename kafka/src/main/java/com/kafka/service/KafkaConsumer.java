package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "test-group")
    public  void getMsg(String msg){
        System.out.println("Consumed msg : "+msg);
    }

}
