package com.sheng.wrma.controller;

import com.sheng.wrma.constant.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shengxingyue, created on 2017/11/12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public Result getUser(@PathVariable Integer id) {
        return null;
    }
}
