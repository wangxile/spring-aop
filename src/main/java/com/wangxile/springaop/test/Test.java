package com.wangxile.springaop.test;

import com.wangxile.springaop.config.AppConfig;
import com.wangxile.springaop.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/12
 * @Modified by:
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Service service = annotationConfigApplicationContext
                .getBean(Service.class);
        //System.out.println(service.getClass().getName());
        service.query();
    }
}
