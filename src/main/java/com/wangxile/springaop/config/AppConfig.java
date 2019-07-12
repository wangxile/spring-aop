package com.wangxile.springaop.config;

import com.wangxile.springaop.enable.EnableAOP;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.annotation.Retention;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/12
 * @Modified by:
 */
@Configuration
@ComponentScan("com.wangxile")
//@EnableAspectJAutoProxy
@EnableAOP
public class AppConfig {
}
