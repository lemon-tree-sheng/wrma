package com.sheng.wrma.controller;

import com.sheng.wrma.modal.UserDO;
import com.sheng.wrma.model.constant.Result;
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
        UserDO userDO = new UserDO();
        userDO.setId(id);
        userDO.setName("sheng:" + id);
        return Result.success(userDO);
    }
}
