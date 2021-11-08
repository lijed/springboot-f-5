/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.boot.spi;

import com.me.learn.boot.log.ILog;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.ClassUtils;

import java.util.List;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/10/30
 **/
public class SpiTest {

    @Test
    public void testSpringSPi() {
        List<String> list = SpringFactoriesLoader.loadFactoryNames(ILog.class, ClassUtils.getDefaultClassLoader());
        list.forEach(clazz -> {
            System.out.println(clazz);
        });
    }
}
