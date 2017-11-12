package com.sheng.wrma.model.constant;

import lombok.Data;

/**
 * @author shengxingyue, created on 2017/11/12
 */
@Data
public class Result<T> {
    private Boolean success = true;
    private String message = "";
    private Integer code = 200;
    private T data = null;

    public static Result success() {
        return new Result();
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        return result;
    }
}
