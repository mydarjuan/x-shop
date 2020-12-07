package com.xshop.item.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "nacos-net-demo")
@RequestMapping("/api")
public interface NetClient {
    @RequestMapping(value = "/weatherforecast", method = RequestMethod.GET)
    Object weatherforecast();
}
