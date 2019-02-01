package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

/*
    @Autowired
    KafkaTemplate<String,Student> kafkaTemplate;
*//*
    @RequestMapping("/send/{msg}")
    public String doSend(@PathVariable String msg){

        kafkaTemplate.send("test", msg);
        return "Produced successfully";
    }*//*

    @RequestMapping("/json/{name}")
    public String doJsonSend(@PathVariable String name){

        Student s = new Student(name,"102","Pune");
        kafkaTemplate.send("test",s);
        return "Json Sent!";
    }*/
}
