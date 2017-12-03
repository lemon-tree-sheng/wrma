package com.sheng.wrma.service;

import com.sheng.wrma.BaseMvcTest;
import com.sheng.wrma.model.entity.UserDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

/**
 * @author shengxingyue, created on 2017/12/3
 */
public class UserServiceTest extends BaseMvcTest {

    @Autowired
    UserService userService;

    @Test
    public void testLogin() throws Exception {
        UserDO userDO = new UserDO("sheng", "123456");
        Assert.isTrue(userService.login(userDO, session));
    }
}
