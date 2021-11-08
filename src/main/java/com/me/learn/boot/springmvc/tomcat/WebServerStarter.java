/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.boot.springmvc.tomcat;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.modeler.Registry;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.server.WebServerException;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import java.io.File;
import java.io.IOException;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/10/31
 **/
public class WebServerStarter {
    private static File baseDirectory = null;
    public static void main(String[] args) {
        ServletContextInitializer[] servletContextInitializers = null;

            Tomcat tomcat = new Tomcat();
            File baseDir = (baseDirectory != null) ? baseDirectory : createTempDir("tomcat");
            tomcat.setBaseDir(baseDir.getAbsolutePath());
        String protocol = null;
        Connector connector = new Connector(protocol);
            connector.setThrowOnFailure(true);
            tomcat.getService().addConnector(connector);
//            customizeConnector(connector);
            tomcat.setConnector(connector);
            tomcat.getHost().setAutoDeploy(false);
//            configureEngine(tomcat.getEngine());
        Iterable<? extends Connector> additionalTomcatConnectors  = null;
        for (Connector additionalConnector : additionalTomcatConnectors) {
                tomcat.getService().addConnector(additionalConnector);
            }
//            prepareContext(tomcat.getHost(), initializers);
//            return getTomcatWebServer(tomcat);
        }

    protected static final File createTempDir(String prefix) {
        try {
            File tempDir = File.createTempFile(prefix + ".", "." + 8080);
            tempDir.delete();
            tempDir.mkdir();
            tempDir.deleteOnExit();
            return tempDir;
        }
        catch (IOException ex) {
            throw new WebServerException(
                    "Unable to create tempDir. java.io.tmpdir is set to " + System.getProperty("java.io.tmpdir"), ex);
        }
    }
}
