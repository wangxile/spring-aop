package com.wangxile.springaop.invocationhandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/12
 * @Modified by:
 */
public class XileInvocationHandler implements InvocationHandler {

    public Object target;

    public XileInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy-before");
        return method.invoke(target,args);
    }
}
