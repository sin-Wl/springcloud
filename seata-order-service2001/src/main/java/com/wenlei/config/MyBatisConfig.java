package com.wenlei.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "com.wenlei.dao")
public class MyBatisConfig {
}
