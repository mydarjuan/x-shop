package com.xshop.item.mq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitHandler
    @RabbitListener(queues = DelayedRabbitMQConfig.DELAYED_QUEUE_NAME, containerFactory = "customContainerFactory")
    public void process(Message message) {
        System.out.println("Thread name-" + Thread.currentThread().getId() + ",Receiver:" + new String(message.getBody()));
    }
}