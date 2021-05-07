package com.icbc.argus.log.slf4j.api;

import com.icbc.argus.log.slf4j.Logger;
import com.icbc.argus.log.slf4j.factory.LoggerSpiFactory;

/**
 * 日志记录API
 * 支持指定日志句柄输出自定义格式
 *
 * @author COSY
 * @version 1.0
 * @date 2021/5/7 9:07
 */
public class RecordLogApi {
    // 在这里添加需要增加的SPI日志句柄
    public static final String DEFAULT_LOG_FILENAME = "argusLogHandler";

    private static Logger logger = null;

    static {
        try {
            // 在这里获取需要的日志句柄
            logger = LoggerSpiFactory.getLogger(DEFAULT_LOG_FILENAME);
        } catch (Throwable t) {
            System.err.println("Error: failed to initialize Argus RecordLog");
            t.printStackTrace();
        }
    }

    public static void info(String format, Object... arguments) {
        logger.info(format, arguments);
    }

    public static void info(String msg, Throwable e) {
        logger.info(msg, e);
    }

    public static void warn(String format, Object... arguments) {
        logger.warn(format, arguments);
    }

    public static void warn(String msg, Throwable e) {
        logger.warn(msg, e);
    }

    public static void trace(String format, Object... arguments) {
        logger.trace(format, arguments);
    }

    public static void trace(String msg, Throwable e) {
        logger.trace(msg, e);
    }

    public static void debug(String format, Object... arguments) {
        logger.debug(format, arguments);
    }

    public static void debug(String msg, Throwable e) {
        logger.debug(msg, e);
    }

    public static void error(String format, Object... arguments) {
        logger.error(format, arguments);
    }

    public static void error(String msg, Throwable e) {
        logger.error(msg, e);
    }
}
