package com.sheng.wrma.dao;

import com.sheng.wrma.model.entity.TagDO;

public interface TagDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TagDO record);

    int insertSelective(TagDO record);

    TagDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TagDO record);

    int updateByPrimaryKey(TagDO record);
}