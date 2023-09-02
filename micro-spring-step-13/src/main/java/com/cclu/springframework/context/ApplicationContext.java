package com.cclu.springframework.context;

import com.cclu.springframework.beans.factory.HierarchicalBeanFactory;
import com.cclu.springframework.beans.factory.ListableBeanFactory;
import com.cclu.springframework.core.io.ResourceLoader;

/**
 * @author ChangCheng Lu
 * @date 2023/9/2 8:54
 */
// todo applicationEventPublisher
public interface ApplicationContext extends HierarchicalBeanFactory, ListableBeanFactory, ResourceLoader {
}
