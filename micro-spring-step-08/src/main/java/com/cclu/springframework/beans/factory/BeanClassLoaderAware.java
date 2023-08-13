package com.cclu.springframework.beans.factory.xml;

import com.cclu.springframework.beans.factory.Aware;

/**
 * @author ChangCheng Lu
 * @date 2023/8/13 13:07
 *
 * Callback that allows a bean to be aware of the bean
 * {@link ClassLoader class loader}; that is, the class loader used by the
 * present bean factory to load bean classes.
 */
public interface BeanClassLoaderAware extends Aware {



}
