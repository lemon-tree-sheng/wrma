package com.sheng.wrma.service;

import com.sheng.wrma.model.entity.UserDO;

import javax.servlet.http.HttpSession;

/**
 * @author shengxingyue, created on 2017/12/3
 */
public interface UserService {
    /**
     * 用户登录
     * @param userDO
     */
    Boolean login(UserDO userDO, HttpSession session);
}
