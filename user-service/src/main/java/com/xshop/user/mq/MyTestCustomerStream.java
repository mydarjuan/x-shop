package com.xshop.user.mq;

import org.springframework.cloud.stream.messaging.Sink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyTestCustomerStream {

    @StreamListener(Sink.INPUT)
    public void receive(String messageBody){
        log.info("自定义接口消费:通过stream收到了消息:messageBody = {}",messageBody);
    }

}

