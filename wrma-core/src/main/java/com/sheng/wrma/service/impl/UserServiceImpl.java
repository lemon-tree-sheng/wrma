package com.sheng.wrma.service.impl;

import com.sheng.wrma.constant.Constant;
import com.sheng.wrma.dao.UserDOMapper;
import com.sheng.wrma.model.entity.UserDO;
import com.sheng.wrma.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * @author shengxingyue, created on 2017/12/3
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDOMapper userDao;

    @Override
    public Boolean login(UserDO userDO, HttpSession session) {
        if (isValid(userDO)) {
            session.setAttribute(Constant.CURRENT_USER, userDO.getUsername() + userDO.getPassword());
            return true;
        }
        return false;
    }

    private Boolean isValid(UserDO userDO) {
        if (userDO != null) {
            if (null != userDO.getUsername() && userDao.findByUsername(userDO.getUsername()) > 0) {
                if (userDao.findBySample(userDO) > 0) {
                    return true;
                } else {
                    throw new RuntimeException("密码错误");
                }
            } else {
                throw new RuntimeException("用户名不存在");
            }
        }
        return false;
    }
}
