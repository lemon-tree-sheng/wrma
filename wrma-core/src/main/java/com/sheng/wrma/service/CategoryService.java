package com.sheng.wrma.service;

import com.sheng.wrma.model.entity.BlogCategoryDO;

import java.util.List;

/**
 * @author shengxingyue, created on 2017/12/4
 * 博客分类服务
 */
public interface CategoryService {
    /**
     * 新增一个博客分类
     * @param categoryName
     * @param order
     */
    Boolean save(String categoryName, Integer order);

    /**
     * 更新分类名称和展示次序
     * @param categoryId
     * @param newCategoryName
     * @param newOrder
     */
    Boolean update(Integer categoryId, String newCategoryName, Integer newOrder);

    /**
     * 删除分类
     * @param categoryId
     */
    Boolean delete(Integer categoryId);

    /**
     * 查询分类列表
     */
    List<BlogCategoryDO> queryList();
}
