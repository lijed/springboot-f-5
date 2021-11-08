package com.me.learn.boot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname WYController
 * @Description TODO
 * @Author 无涯
 * Date 2021/10/27 21:10
 * Version 1.0
 */
@Controller
@Api(tags = "springboot学习工程相关接口")
public class WYController {

    @ApiOperation("查询用户接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "wy"),
            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "长沙")
    })
    @RequestMapping("/queryUser")
    public @ResponseBody
    String queryUser(String username,String address) {
        return "wy";
    }
}
