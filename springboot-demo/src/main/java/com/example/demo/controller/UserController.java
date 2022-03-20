package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

//    @Resource
//    UserMapper userMapper;

    UserService userService = new UserService();

    @PostMapping
    public Result<?> save(@RequestBody User user){
        return userService.userInsert(user);
//        userMapper.insert(user);
//        return Result.success();

    }
}
