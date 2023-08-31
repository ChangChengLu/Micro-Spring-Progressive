package com.cclu.springframework.context;

import com.cclu.springframework.beans.factory.HierarchicalBeanFactory;
import com.cclu.springframework.beans.factory.ListableBeanFactory;
import com.cclu.springframework.core.io.ResourceLoader;

/**
 * @author ChangCheng Lu
 * @date 2023/8/13 12:47
 *
 * Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
