package com.xshop.order.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RocketMQMessageListener(topic = "user-register-topic", consumerGroup = "user-group", consumeThreadMax = 10)
public class MyConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String msg) {
        System.out.println(String.format("thread name:%s,msg:%s", Thread.currentThread().getName(), msg));
    }
}
