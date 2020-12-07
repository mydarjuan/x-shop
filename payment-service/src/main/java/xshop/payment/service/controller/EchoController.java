package xshop.payment.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoController {
    @RequestMapping("/hello")
    public String hello() {
        return "helle consul";
    }
}
