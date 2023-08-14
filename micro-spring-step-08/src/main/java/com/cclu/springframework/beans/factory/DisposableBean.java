package com.cclu.springframework.beans.factory;

/**
 * @author ChangCheng Lu
 * @date 2023/8/11 16:31
 *
 * Interface to be implemented by beans that want to release resources
 * on destruction. A BeanFactory is supposed to invoke the destroy
 * method if it disposes a cached singleton. An application context
 * is supposed to dispose all of its singletons on close.
 */
public interface DisposableBean {

    /**
     * release the resource of the bean which implements this interface
     * @throws Exception
     */
    void destroy() throws Exception;

}
