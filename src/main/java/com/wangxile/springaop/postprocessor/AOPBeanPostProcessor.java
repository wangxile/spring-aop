package com.wangxile.springaop.postprocessor;

import com.wangxile.springaop.invocationhandler.XileInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/12
 * @Modified by:
 *
 * 1.spring在启动的时候就已经将切面的代理对象生成好了,直接放到map容器中，每次去取就行了。
 * 2.BeanPostProcessor 中有2个方法: postProcessBeforeInitialization(实例化对象前做操作) postProcessAfterInitialization(实例化对象后做操作) Aop就是在对象实例化后将其变为代理对象
 * 3.spring提供了很多BeanPostProcessor,我们也可以通过实现BeanPostProcessor，通过@Component注解将实现类交由spring管理。
 * 4.spring在通过registerBeanPostProcessor,将所有BeanPostProcessor汇总，实例化对象的时候会遍历所有存在的BeanPostProcessor，对bean进行对应的操作
 */

public class AOPBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //变成代理对象
        if(beanName.equals("indexServiceImpl")){
            XileInvocationHandler xileInvocationHandler = new XileInvocationHandler(bean);
            bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),bean.getClass().getInterfaces(),
                     xileInvocationHandler);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
