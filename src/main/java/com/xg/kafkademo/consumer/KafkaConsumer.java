package com.xg.kafkademo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @program: kafkademo
 * @description: 消费者
 * @author: gzk
 * @create: 2019-12-27 14:23
 **/
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"kafkaDemo"})
    public void kafkaConsumer(ConsumerRecord<?,?> record){

        System.out.println(record.value());

        System.err.println(record);

    }


}
