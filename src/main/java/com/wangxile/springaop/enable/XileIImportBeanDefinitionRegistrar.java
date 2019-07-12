package com.wangxile.springaop.enable;

import com.wangxile.springaop.postprocessor.AOPBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/13
 * @Modified by:  动态实现是否开启代理配置
 */

public class XileIImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        //创建AOPBeanPostProcessor对应的 BeanDefinition
        BeanDefinitionBuilder definitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(AOPBeanPostProcessor.class);
        AbstractBeanDefinition beanDefinition = definitionBuilder.getBeanDefinition();
        //设置beanDefinition的beanClass
        beanDefinition.setBeanClass(AOPBeanPostProcessor.class);
        //向spring的beanDefinition中注入
        beanDefinitionRegistry.registerBeanDefinition("aopBeanPostProcessor",beanDefinition);

    }
}
