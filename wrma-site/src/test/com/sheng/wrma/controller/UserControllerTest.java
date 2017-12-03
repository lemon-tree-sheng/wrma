package com.sheng.wrma.controller;

import com.sheng.wrma.BaseMvcTest;
import com.sheng.wrma.model.entity.UserDO;
import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author shengxingyue, created on 2017/12/3
 */
public class UserControllerTest extends BaseMvcTest {

    @Test
    public void testLogin() throws Exception {
        String result = mockMvc.perform(post("/admin/user/login.do")
                .session(session)
                .param("username", "sheng")
                .param("password", "123456"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }
}
