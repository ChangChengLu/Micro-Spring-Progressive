package com.cclu.springframework.beans.factory;

import com.cclu.springframework.beans.factory.Aware;

/**
 * @author ChangCheng Lu
 * @date 2023/8/13 13:11
 *
 * Interface to be implemented by beans that want to be aware of their
 * bean name in a bean factory. Note that it is not usually recommended
 * that an object depend on its bean name, as this represents a potentially
 * brittle dependence on external configuration, as well as a possibly
 * unnecessary dependence on a Spring API.
 */
public interface BeanNameAware extends Aware {

    /**
     * set bean name
     * @param name
     */
    void setBeanName(String name);

}
