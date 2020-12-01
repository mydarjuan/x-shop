package com.xshop.item.controller;

import com.xshop.item.mq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/echo")
@RestController
public class EchoController {

    @Autowired
    private Sender sender;

    @GetMapping("/hi")
    public String hi() {
        return "hi, i'm item service";
    }

    @GetMapping("/rabbit")
    public String rabbit() {
        for (int i = 0; i < 1000; i++) {
            sender.send(i);
        }
        return "SUCCESS";
    }
}
