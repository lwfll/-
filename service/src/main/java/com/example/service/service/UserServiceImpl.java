package com.example.service.service;

import com.example.common.api.UserService;
import com.example.common.pojo.User;
import com.example.dao.mapper.UserMapper;

import javax.annotation.Resource;

/**
 * @Author lwf
 * @Description //TODO
 */
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public String insert() {
        User user = new User();
        user.setUserName("吴荣刚");
        user.setPassWord("123456");
        userMapper.insert(user);
     return "1";
    }
}
