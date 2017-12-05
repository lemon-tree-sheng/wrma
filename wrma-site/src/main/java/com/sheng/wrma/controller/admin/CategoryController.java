package com.sheng.wrma.controller.admin;

import com.sheng.wrma.constant.Result;
import com.sheng.wrma.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shengxingyue, created on 2017/12/4
 */
@RestController
@RequestMapping("/admin/category")
@Api(value = "category-api", basePath = "/admin/category", description = "博客分类接口")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save.do")
    @ApiOperation("新增分类")
    public Result save(@ApiParam(value = "新分类名称", required = true) @RequestParam(value = "categoryName") String categoryName,
                       @ApiParam(value = "分类次序，决定该分类在首页的展示次序") @RequestParam(value = "categoryOrder", defaultValue = "0") Integer categoryOrder) {
        return categoryService.save(categoryName, categoryOrder) ? Result.success("新增分类成功") : Result.fail("新增分类失败");
    }

    @PostMapping("/update.do")
    @ApiOperation("更新分类名称和次序")
    public Result update(@ApiParam(value = "分类 id", required = true) @RequestParam(value = "categoryId") Integer categoryId,
                         @ApiParam(value = "新分类名称") @RequestParam(value = "newCategoryName") String newCategoryName,
                         @ApiParam(value = "新分类次序") @RequestParam(value = "newOrder") Integer newOrder) {
        if (StringUtils.isEmpty(newCategoryName) && null == newOrder) {
            return Result.fail("新分类名称、新分类次序必填一个");
        }
        return categoryService.update(categoryId, newCategoryName, newOrder) ? Result.success("更新分类成功") : Result.fail("更新分类失败");
    }

    @PostMapping("/delete.do")
    @ApiOperation("删除分类")
    public Result delete(@ApiParam(value = "分类 id", required = true) @RequestParam(value = "categoryId") Integer categoryId) {
        return categoryService.delete(categoryId) ? Result.success("删除分类成功") : Result.fail("删除分类失败");
    }

    @PostMapping("/queryList.do")
    @ApiOperation("查询分类列表")
    public Result queryList() {
        return Result.success(categoryService.queryList());
    }
}
