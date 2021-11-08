package com.me.learn.boot.jersey;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname JerseyConfig
 * @Description TODO
 * @Author 无涯
 * Date 2021/10/27 22:16
 * Version 1.0
 */
@Configuration
public class JerseyConfig {

    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new ServletContainer(), "/rest/*");
        servletRegistrationBean.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyResourceConfig.class.getName());
        return servletRegistrationBean;
    }
}
