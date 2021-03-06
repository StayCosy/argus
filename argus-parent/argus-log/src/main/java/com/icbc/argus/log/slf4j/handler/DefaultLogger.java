package com.icbc.argus.log.slf4j.handler;

import com.icbc.argus.log.slf4j.Logger;
import com.icbc.argus.log.slf4j.annotation.LoggerTarget;
import com.icbc.argus.monitor.Monitor;
import org.slf4j.LoggerFactory;

/**
 * 默认日志输出实现
 *
 * @author COSY
 * @version 1.0
 * @date 2021/5/1 10:44
 */
@LoggerTarget
public class DefaultLogger implements Logger, Monitor {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(DefaultLogger.class);

    @Override
    public void info(String format, Object... arguments) {
        logger.info(format, arguments);
    }

    @Override
    public void info(String msg, Throwable e) {
        logger.info(msg, e);
    }

    @Override
    public void warn(String format, Object... arguments) {
        logger.warn(format, arguments);
    }

    @Override
    public void warn(String msg, Throwable e) {
        logger.warn(msg, e);
    }

    @Override
    public void trace(String format, Object... arguments) {
        logger.trace(format, arguments);
    }

    @Override
    public void trace(String msg, Throwable e) {
        logger.trace(msg, e);
    }

    @Override
    public void debug(String format, Object... arguments) {
        logger.debug(format, arguments);
    }

    @Override
    public void debug(String msg, Throwable e) {
        logger.debug(msg, e);
    }

    @Override
    public void error(String format, Object... arguments) {
        logger.error(format, arguments);
    }

    @Override
    public void error(String msg, Throwable e) {
        logger.error(msg, e);
    }
}
