/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.boot.propertysource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/11/1
 **/
@Component
public class UserBean  implements InitializingBean {

    @Value("${spring.user.name}")
    private String userName;


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("user name:" + userName);
    }
}
