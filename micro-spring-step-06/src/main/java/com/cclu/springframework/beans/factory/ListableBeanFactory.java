package com.cclu.springframework.beans.factory;

import java.util.Map;

/**
 * @author ChangCheng Lu
 * @date 2023/7/10 10:35
 */
public interface ListableBeanFactory extends BeanFactory {

    <T>Map<String, T> getBeanOfType(Class<T> type);

    String[] getBeanDefinitionNames();

}
