package com.sheng.wrma.controller.admin;

import com.sheng.wrma.constant.Result;
import com.sheng.wrma.model.UserVO;
import com.sheng.wrma.model.entity.UserDO;
import com.sheng.wrma.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
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
@Api(value = "user-api", basePath = "/admin/user", description = "用户接口")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login.do")
    @ApiOperation("用户登录接口")
    public Result login(UserVO userVO, HttpSession session) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userVO, userDO);
        userService.login(userDO, session);
        return Result.success("登录成功");
    }
}
