package com.xshop.item.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "order-service")
@RequestMapping("/echo")
public interface OrderClient {
    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    String sayHi();
}
