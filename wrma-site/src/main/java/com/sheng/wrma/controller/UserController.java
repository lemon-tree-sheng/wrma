package com.sheng.wrma.controller;

import com.sheng.wrma.modal.UserDO;
import com.sheng.wrma.model.constant.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shengxingyue, created on 2017/11/12
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user.do", method = RequestMethod.GET)
    @ResponseBody
    public Result getUser() {
        System.out.println("id:");
        UserDO userDO = new UserDO();
        userDO.setId(1);
        userDO.setName("sheng");
        return Result.success(userDO);
    }
}
