package com.wenlei.service;


import com.wenlei.entity.CommonResult;
import com.wenlei.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")//value --> 调用的微服务名称
public interface PaymentFeignService
{
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id); //调用的是微服务CLOUD-PAYMENT-SERVICE的getPaymentById()方法

}
