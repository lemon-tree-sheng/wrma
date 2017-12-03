package com.sheng.wrma.dao;

import com.sheng.wrma.BaseTest;
import com.sheng.wrma.model.entity.UserDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author shengxingyue, created on 2017/12/3
 */
public class UserDOMapperTest extends BaseTest {
    @Autowired
    UserDOMapper userDOMapper;

    @Test
    public void testInsert() {
        UserDO userDO = new UserDO();
        userDO.setUsername("sheng");
        userDO.setPassword("123456");
        userDO.setCreateTime(new Date());
        userDO.setUpdateTime(new Date());
        userDOMapper.insert(userDO);
    }
}
