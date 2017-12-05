package com.sheng.wrma.controller;

import com.sheng.wrma.BaseMvcTest;
import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author shengxingyue, created on 2017/12/4
 */
public class CategoryControllerTest extends BaseMvcTest {

    @Test
    public void save() throws Exception {
        String result = mockMvc.perform(post("/admin/category/save.do")
                .param("categoryName", "测试分类名称")
                .param("categoryOrder", "1"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }

    @Test
    public void update() throws Exception {
        String result = mockMvc.perform(post("/admin/category/update.do")
                .param("categoryId", "1")
                .param("newCategoryName", "新的测试分类名称")
                .param("newOrder", "2"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }

    @Test
    public void delete() throws Exception {
        String result = mockMvc.perform(post("/admin/category/delete.do")
                .param("categoryId", "1"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }

    @Test
    public void queryList() throws Exception {
        String result = mockMvc.perform(post("/admin/category/queryList.do"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }
}
