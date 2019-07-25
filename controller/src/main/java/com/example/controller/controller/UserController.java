package com.example.controller.controller;


import com.example.dao.pojo.User;
import com.example.service.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Author lwf
 * @Description //TODO
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户模块",tags = "用户模块API")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation("新增用户")
    @PostMapping("/insert")
    public  String insert(){
        User user = new User();
        user.setUserName("吴荣刚");
        user.setPassWord("123456");
        userService.insert(user);
        return "1";
    }

}
