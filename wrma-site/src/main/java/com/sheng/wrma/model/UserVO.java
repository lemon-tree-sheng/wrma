package com.sheng.wrma.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author shengxingyue, created on 2017/12/4
 */
@Data
@ApiModel("用户对象")
public class UserVO {
    @ApiModelProperty(value = "用户名", required = true)
    String username;
    @ApiModelProperty(value = "密码", required = true)
    String password;
}
