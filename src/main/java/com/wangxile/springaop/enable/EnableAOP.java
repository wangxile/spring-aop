package com.wangxile.springaop.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/13
 * @Modified by: 引入自定义的BeanDefinitionRegistrar  这样使用该注解就能够动态的往spring中注入AOPBeanPostProcessor
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(XileIImportBeanDefinitionRegistrar.class)
public @interface EnableAOP {

}
