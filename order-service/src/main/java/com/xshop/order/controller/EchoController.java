package com.xshop.order.controller;

import com.xshop.order.clients.ItemClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/echo")
@RestController()
public class EchoController {

    @Autowired
    private ItemClient itemClient;

    @GetMapping("/sayHi")
    public String hi() {
        return "hi, i'm order service";
    }

    @GetMapping("/item/hi")
    public String itemSayHello() {
        return itemClient.sayHi();
    }
}
