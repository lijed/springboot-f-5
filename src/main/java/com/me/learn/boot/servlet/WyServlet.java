package com.me.learn.boot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Classname WyServlet
 * @Description TODO
 * @Author 无涯
 * Date 2021/10/27 21:20
 * Version 1.0
 */
@WebServlet(urlPatterns = "/wy/*")
public class WyServlet extends HttpServlet {
    public WyServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------doGet-----------");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------doPut-----------");
    }
}
