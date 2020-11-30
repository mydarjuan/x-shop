package com.xshop.order.controller;

import com.alibaba.fastjson.JSON;
import com.xshop.order.clients.ItemClient;
import com.xshop.order.service.RocketMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/echo")
@RestController()
public class EchoController {

    @Autowired
    private ItemClient itemClient;

    @Autowired
    private RocketMQProducer rocketMQProducer;

    @GetMapping("/sayHi")
    public String hi() {
        return "hi, i'm order service";
    }

    @GetMapping("/item/hi")
    public String itemSayHello() {
        return itemClient.sayHi();
    }

    @GetMapping("/mq/test")
    public Object mgTest() {
        for (int i = 0; i < 100; i++) {
            rocketMQProducer.sendDelayMsg("user-register-topic", JSON.toJSONString("mq test" + i), 3);
        }
        return "SUCCESS";
    }
}
