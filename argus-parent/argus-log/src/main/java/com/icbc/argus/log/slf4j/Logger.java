package com.icbc.argus.log.slf4j;

/**
 * 日志接口
 *
 * @author COSY
 * @version 1.0
 * @date 2021/5/1 10:36
 */
public interface Logger {
    /**
     * @return void
     * @Description nfo级输出格式化日志信息
     * @Date 2021/5/1 10:37
     * @Param [format, arguments]
     **/
    void info(String format, Object... arguments);

    /**
     * @return void
     * @Description info级输出exception信息
     * @Date 2021/5/1 10:38
     * @Param [msg, e]
     **/
    void info(String msg, Throwable e);

    /**
     *
     * @Description warn级输出格式化日志信息
     * @Date 2021/5/1 10:39
     * @Param [format, arguments]
     * @return void
     **/
    void warn(String format, Object... arguments);

    /**
     *
     * @Description warn级输出exception信息
     * @Date 2021/5/1 10:40
     * @Param [msg, e]
     * @return void
     **/
    void warn(String msg, Throwable e);

    /**
     *
     * @Description trace级输出格式化日志信息
     * @Date 2021/5/1 10:40
     * @Param [format, arguments]
     * @return void
     **/
    void trace(String format, Object... arguments);

    /**
     *
     * @Description trace级输出exception信息
     * @Date 2021/5/1 10:41
     * @Param [msg, e]
     * @return void
     **/
    void trace(String msg, Throwable e);

    /**
     *
     * @Description debug级输出格式化日志信息
     * @Date 2021/5/1 10:42
     * @Param [format, arguments]
     * @return void
     **/
    void debug(String format, Object... arguments);

    /**
     *
     * @Description debug级输出exception信息
     * @Date 2021/5/1 10:42
     * @Param [msg, e]
     * @return void
     **/
    void debug(String msg, Throwable e);

    /**
     *
     * @Description error级输出格式化日志信息
     * @Date 2021/5/1 10:42
     * @Param [format, arguments]
     * @return void
     **/
    void error(String format, Object... arguments);

    /**
     *
     * @Description error级输出exception信息
     * @Date 2021/5/1 10:43
     * @Param [msg, e]
     * @return void
     **/
    void error(String msg, Throwable e);
}
