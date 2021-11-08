package com.me.learn.boot.test;

import com.me.learn.boot.SpringBootApp;
import com.me.learn.boot.bean.ConsultConfigArea;
import com.me.learn.boot.dao.CommonMapper;
import com.me.learn.boot.mongo.MongoService;
import com.me.learn.boot.mongo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.List;

/**
 * @Classname MyTest
 * @Description TODO
 * @Author 无涯
 * Date 2021/10/27 21:54
 * Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootApp.class)
@WebAppConfiguration
public class MyTest {

    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    @Autowired
    private CommonMapper commonMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private MongoService mongoService;

    @Test
    public void mapper() {
        List<ConsultConfigArea> consultConfigAreas = commonMapper.qryArea(new HashMap());
        for (ConsultConfigArea consultConfigArea : consultConfigAreas) {
            logger.info(consultConfigArea.getAreaCode() + "   " + consultConfigArea.getAreaName() + "  " + consultConfigArea.getState());
        }
    }

    @Test
    public void redis() {
        redisTemplate.opsForValue().set("username","wy");
        System.out.println(redisTemplate.opsForValue().get("username"));
    }

    @Test
    public void mongo() {
        User user = new User();
        user.setUsername("wy");
        user.setPassword("123");
        user.setId("99");
        mongoService.save(user);
        System.out.println(mongoService.findAll());
    }
}
