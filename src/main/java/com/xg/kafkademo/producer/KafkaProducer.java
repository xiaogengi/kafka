package com.xg.kafkademo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: kafkademo
 * @description: 生产者
 * @author: gzk
 * @create: 2019-12-27 14:22
 **/
@RestController
public class KafkaProducer {


    @Autowired
    private KafkaTemplate kafkaTemplate;


    @RequestMapping("test")
    public void test(){
        for (int i = 0; i < 100; i++) {
            kafkaTemplate.send("kafkaDemo","我是" + i);
        }
    }


}
