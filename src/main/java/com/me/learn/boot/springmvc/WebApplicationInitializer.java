/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.boot.springmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/10/31
 **/
public interface WebApplicationInitializer {
    public  void config(ServletContext context) throws ServletException;

}
