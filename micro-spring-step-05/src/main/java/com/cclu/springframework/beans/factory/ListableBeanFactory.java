package com.cclu.springframework.beans.factory;

import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/7/7 20:58
 */
public interface ListableBeanFactory extends BeanFactory {

    <T> Map<String, T> getBeansOfType(Class<T> type);

    String[] getBeanDefinitionNames();

}
