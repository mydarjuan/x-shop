package com.xshop.item.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/echo")
@RestController
public class EchoController {

    @GetMapping("/hi")
    public String hi() {
        return "hi, i'm item service";
    }
}
