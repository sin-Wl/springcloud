package com.wenlei.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;


@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB()
    {
        try {
            TimeUnit.MILLISECONDS.sleep(3000);  //等待3s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "------testB";
    }
}
