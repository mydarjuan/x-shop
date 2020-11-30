package com.xshop.user.controller;

import com.xshop.user.dao.UserMapper;
import com.xshop.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liujianbo
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Source source;



    @GetMapping("/list")
    public Object getUsers() {
        List<User> users = userMapper.selectList(null);
        source.output().send(MessageBuilder.withPayload(users).build());
        return users;
    }
}
