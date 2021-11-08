/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.boot.springmvc;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.lang.reflect.Modifier;
import java.util.Set;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/10/31
 **/
@HandlesTypes(WebApplicationInitializer.class)
public class JedSpringServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> webApplicationInitializers, ServletContext servletContext) throws ServletException {
        if (webApplicationInitializers != null) {
            for (Class<?> webApplicationInitializerClass : webApplicationInitializers) {
                if (!webApplicationInitializerClass.isInterface() && !Modifier.isAbstract(webApplicationInitializerClass.getModifiers()) &&
                        WebApplicationInitializer.class.isAssignableFrom(webApplicationInitializerClass)) {
                    try {
                        WebApplicationInitializer webApplicationInitializer = (WebApplicationInitializer) webApplicationInitializerClass.newInstance();
                        webApplicationInitializer.config(servletContext);

                    }
                    catch (Throwable ex) {
                        throw new ServletException("Failed to instantiate webApplicationInitializer class", ex);
                    }
                }
            }
        }



    }
}
