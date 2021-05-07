package com.icbc.argus.log.slf4j.factory;

import com.icbc.argus.log.slf4j.Logger;
import com.icbc.argus.log.slf4j.annotation.LoggerTarget;
import com.mysql.cj.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

/**
 * SPI日志句柄获取工厂
 *
 * @author COSY
 * @version 1.0
 * @date 2021/5/7 9:08
 */
public class LoggerSpiFactory {
    private static final Map<String, Logger> LOGGER_MAP = new HashMap<>();

    static {
        try {
            resolveLoggers();
        } catch (Throwable t) {
            System.err.println("Failed to resolve Sentinel Logger SPI");
            t.printStackTrace();
        }
    }

    /**
     * 获取日志对象
     *
     * @param name 日志对象名词
     * @return 日志对象
     */
    public static Logger getLogger(String name) {
        if (name == null) {
            return null;
        }
        return LOGGER_MAP.get(name);
    }

    /**
     * 加载日志对象
     */
    private static void resolveLoggers() {
        ServiceLoader<Logger> loggerLoader = ServiceLoader.load(Logger.class);

        for (Logger logger : loggerLoader) {
            LoggerTarget annotation = logger.getClass().getAnnotation(LoggerTarget.class);
            if (annotation == null) {
                continue;
            }
            String name = annotation.value();
            if (!StringUtils.isNullOrEmpty(name) && !LOGGER_MAP.containsKey(name)) {
                LOGGER_MAP.put(name, logger);
            }
        }
    }
}
