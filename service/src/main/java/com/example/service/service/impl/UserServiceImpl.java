package com.example.service.service.impl;


import com.example.dao.mapper.UserMapper;
import com.example.dao.pojo.User;
import com.example.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author lwf
 * @Description //TODO
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
