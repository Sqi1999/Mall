package com.macro.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shaoqi
 * @version 1.0
 * @date 2022/1/20 10:55
 */
@Configuration
@MapperScan("mapper")
public class MybatisConfig {
}
