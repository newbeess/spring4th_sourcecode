package com.leon.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 启用aspectJ的自动代理，会为切面自动创建代理类
 */
@Configuration
@ComponentScan("com.leon")
@EnableAspectJAutoProxy
public class AppConfig {
  
}
