package io.github.fairyspace.beans.factory.config;

import io.github.fairyspace.beans.PropertyValues;

public interface InstantiationAwareBeanPostProcessor extends  BeanPostProcessor{

    //实例化之前触发
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName);

    //实例化之后，设置属性之前触发
    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName);
}
