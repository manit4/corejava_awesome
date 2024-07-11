package com.chinese.awesome;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.chinese.awesome, com.chinese.pojo" )
public class ApplicationConfig {

}
