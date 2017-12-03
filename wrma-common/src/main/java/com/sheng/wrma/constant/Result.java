package com.sheng.wrma.constant;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shengxingyue, created on 2017/11/12
 */
@Data
@NoArgsConstructor
public class Result<T> {
    private Boolean success = true;
    private String message = "";
    private Integer code = 200;
    private T data = null;

    private Result(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public static Result success() {
        return new Result();
    }

    public static Result success(String message) {
        return new Result(true, message);
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        return result;
    }

    public static<T> Result<T> fail(String message) {
        return new Result<>(false, message);
    }
}
