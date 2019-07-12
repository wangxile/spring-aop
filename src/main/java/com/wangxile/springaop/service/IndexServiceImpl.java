package com.wangxile.springaop.service;

import org.springframework.stereotype.Component;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/12
 * @Modified by:
 */
@Component
public class IndexServiceImpl implements Service{
    @Override
    public void query() {
        System.out.println("query");
    }
}
