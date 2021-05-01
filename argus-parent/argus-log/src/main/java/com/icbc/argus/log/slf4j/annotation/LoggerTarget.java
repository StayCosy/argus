package com.icbc.argus.log.slf4j.annotation;

import com.icbc.argus.log.slf4j.util.LogConstant;

import java.lang.annotation.*;

/**
 * 日志标签
 *
 * @author COSY
 * @version 1.0
 * @date 2021/5/1 14:12
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface LoggerTarget {
    String value() default LogConstant.DEFAULT_LOG_TARGET;
}
