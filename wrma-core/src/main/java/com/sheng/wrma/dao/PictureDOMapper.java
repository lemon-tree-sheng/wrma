package com.sheng.wrma.dao;

import com.sheng.wrma.model.entity.PictureDO;

public interface PictureDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PictureDO record);

    int insertSelective(PictureDO record);

    PictureDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PictureDO record);

    int updateByPrimaryKey(PictureDO record);
}