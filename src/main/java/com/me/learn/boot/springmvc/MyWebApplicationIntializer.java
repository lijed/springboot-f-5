/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.boot.springmvc;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.util.WebAppRootListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/10/31
 **/
public class MyWebApplicationIntializer implements WebApplicationInitializer {

    @Override
    public void config(ServletContext servletContext) throws ServletException {
        System.err.println("test.................");
        servletContext.addListener(new ContextLoaderListener());
        servletContext.addListener(new WebAppRootListener());
        servletContext.setInitParameter("contextConfigLocation", "classpath*:**/*Context.xml");
        //设置webAppRootKey得值以得到根目录
        servletContext.setInitParameter("webAppRootKey", "learning");


    }
}
