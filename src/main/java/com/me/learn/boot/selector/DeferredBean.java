/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.boot.selector;

import javax.annotation.PostConstruct;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/10/30
 **/
public class DeferredBean {

    @PostConstruct
    public void init() {
        System.out.println("DefferredBean is instantiated and is being initialized.....");
    }
}
