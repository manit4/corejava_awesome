package com.awesome.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy//You have to add this to enable AOP concept in application...
@ComponentScan(basePackages = "com.awesome.service")
public class ApplicationConfig {

}
