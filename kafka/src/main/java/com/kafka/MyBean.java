package com.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by haoyifen on 2017/4/5 14:35.
 */
@Component
public class MyBean {
    private static Logger logger = LoggerFactory.getLogger(MyBean.class);
    private final KafkaTemplate kafkaTemplate;

    @Autowired
    public MyBean(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        //send in a async way, you can get a future and invoke get on it, or you can just let it send in async way
        ListenableFuture<org.springframework.kafka.support.SendResult> send = kafkaTemplate.send("someTopic", "test");
        try {
            send.get();
            System.out.println("send complete");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    @KafkaListener(topics = "newTopic")
    public void processMessage(String content, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) throws InterruptedException {
        logger.info("start to sleep: partition {} content: {}", partition, content);
        // Thread.sleep(100_000);
        logger.info("resume from sleep: partition {} content: {}", partition, content);
    }


    // @KafkaListener(topics = "newTopic")
    // public void test(String content) throws InterruptedException {
    //     Thread.sleep(1000000);
    //     System.out.println(content);
    // }
}
