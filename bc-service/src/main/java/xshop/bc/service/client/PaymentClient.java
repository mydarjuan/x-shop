package xshop.bc.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("payment-service")
@RequestMapping("/echo")
public interface PaymentClient {

    @GetMapping("/hello")
    public String getConsulHello();
}