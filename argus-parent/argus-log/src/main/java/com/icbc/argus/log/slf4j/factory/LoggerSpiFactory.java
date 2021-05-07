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
        // NOTE: this class SHOULD NOT depend on any other Sentinel classes
        // except the util classes to avoid circular dependency.
        try {
            resolveLoggers();
        } catch (Throwable t) {
            System.err.println("Failed to resolve Sentinel Logger SPI");
            t.printStackTrace();
        }
    }

    public static Logger getLogger(String name) {
        if (name == null) {
            return null;
        }
        return LOGGER_MAP.get(name);
    }

    private static void resolveLoggers() {
        // NOTE: Here we cannot use {@code SpiLoader} directly because it depends on the RecordLog.
        ServiceLoader<Logger> loggerLoader = ServiceLoader.load(Logger.class);

        for (Logger logger : loggerLoader) {
            LoggerTarget annotation = logger.getClass().getAnnotation(LoggerTarget.class);
            if (annotation == null) {
                continue;
            }
            String name = annotation.value();
            // Load first encountered logger if multiple loggers are associated with the same name.
            if (!StringUtils.isNullOrEmpty(name) && !LOGGER_MAP.containsKey(name)) {
                LOGGER_MAP.put(name, logger);
                System.out.println("Sentinel Logger SPI loaded for <" + name + ">: "
                        + logger.getClass().getCanonicalName());
            }
        }
    }

    private LoggerSpiFactory() {
    }
}
