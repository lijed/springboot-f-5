package com.me.learn.boot.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

/**
 * @Classname JerseyResourceConfig
 * @Description TODO
 * @Author 无涯
 * Date 2021/10/27 22:18
 * Version 1.0
 */
public class JerseyResourceConfig extends ResourceConfig {

    public JerseyResourceConfig() {
        register(RequestContextFilter.class);
        packages("com.gp.wy.jersey");
    }
}
