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

    @GetMapping("/testD")
    public String testD() {
/*        try {
            TimeUnit.SECONDS.sleep(1);  //1s内处理完请求
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testD 测试RT");
        */
/*        int a = 1/0;  // -->测试sentinel服务降级的 异常比例
        log.info("testD 测试异常比例");*/
        return "testD";
    }

    @GetMapping("/testE")
    public String testE()
    {
        log.info("testE 测试异常数");
        int age = 10/0;
        return "------testE 测试异常数";
    }
}
