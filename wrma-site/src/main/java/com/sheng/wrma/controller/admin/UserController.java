package com.sheng.wrma.controller.admin;

import com.sheng.wrma.constant.Result;
import com.sheng.wrma.model.entity.UserDO;
import com.sheng.wrma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author shengxingyue, created on 2017/11/12
 */
@RestController
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login.do")
    public Result login(UserDO userDO, HttpSession session) {
        userService.login(userDO, session);
        return Result.success("登录成功");
    }
}
