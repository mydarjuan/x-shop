package com.xshop.order.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "item-service")
@RequestMapping("/echo")
public interface ItemClient {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi();
}
