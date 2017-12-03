package com.sheng.wrma.dao;

import com.sheng.wrma.model.entity.BlogCategoryDO;

public interface BlogCategoryDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BlogCategoryDO record);

    int insertSelective(BlogCategoryDO record);

    BlogCategoryDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BlogCategoryDO record);

    int updateByPrimaryKey(BlogCategoryDO record);
}