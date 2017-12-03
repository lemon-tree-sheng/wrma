package com.sheng.wrma.dao;

import com.sheng.wrma.model.entity.UserDO;

public interface UserDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);

    int findByUsername(String username);

    int findBySample(UserDO userDO);
}