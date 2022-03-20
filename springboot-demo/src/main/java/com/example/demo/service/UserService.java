package com.example.demo.service;

import com.example.demo.common.Result;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

import javax.annotation.Resource;

public class UserService {
    @Resource
    UserMapper userMapper;
    public Result<?> userInsert(User user){
        userMapper.insert(user);
        return Result.success();
    }



}
