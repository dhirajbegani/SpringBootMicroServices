package com.eim.userservice.controller;

import com.eim.userservice.VO.ResponseTemplateVO;
import com.eim.userservice.entity.UserEntity;
import com.eim.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserEntity saveUser (@RequestBody UserEntity user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserByUserId (@PathVariable  ("id") Long userId) {

        return userService.getUserByUserId(userId);
    }
}
