package com.sheng.wrma.common;

import com.sheng.wrma.constant.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author shengxingyue, created on 2017/12/3
 */
@ControllerAdvice
public class ExceptionUtil {

    @ExceptionHandler(RuntimeException.class)
    public Result<String> handleException(Exception e) {
        return Result.fail(e.getMessage());
    }
}
