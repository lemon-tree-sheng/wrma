package com.sheng.wrma.service.impl;

import com.sheng.wrma.dao.BlogCategoryDOMapper;
import com.sheng.wrma.model.entity.BlogCategoryDO;
import com.sheng.wrma.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author shengxingyue, created on 2017/12/4
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private BlogCategoryDOMapper blogCategoryDao;

    @Override
    public Boolean save(String categoryName, Integer categoryOrder) {
        // todo 所有对后台的操作都需要登录拦截
        BlogCategoryDO blogCategoryDO = new BlogCategoryDO(categoryName, categoryOrder);
        // todo 自动插入时间
        blogCategoryDO.setCreateTime(new Date());
        blogCategoryDO.setUpdateTime(new Date());
        return blogCategoryDao.insertSelective(blogCategoryDO) == 1;
    }

    @Override
    public Boolean update(Integer categoryId, String newCategoryName, Integer newOrder) {
        BlogCategoryDO blogCategoryDO = blogCategoryDao.selectByPrimaryKey(categoryId);
        if (null == blogCategoryDO) {
            throw new RuntimeException("没有找到更新记录，categoryId:" + categoryId);
        }
        BlogCategoryDO sample = new BlogCategoryDO(newCategoryName, newOrder);
        sample.setId(categoryId);
        return blogCategoryDao.updateByPrimaryKeySelective(sample) == 1;
    }

    @Override
    public Boolean delete(Integer categoryId) {
        BlogCategoryDO blogCategoryDO = blogCategoryDao.selectByPrimaryKey(categoryId);
        if (null == blogCategoryDO) {
            throw new RuntimeException("没有找到相应记录，categoryId:" + categoryId);
        }
        return blogCategoryDao.deleteByPrimaryKey(categoryId) == 1;
    }

    @Override
    public List<BlogCategoryDO> queryList() {
        return blogCategoryDao.findList();
    }
}
