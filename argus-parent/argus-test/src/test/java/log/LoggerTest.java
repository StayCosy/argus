package log;

import com.icbc.argus.log.slf4j.Logger;
import com.icbc.argus.log.slf4j.annotation.LoggerTarget;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * TODO
 *
 * @author COSY
 * @version 1.0
 * @date 2021/5/1 11:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class LoggerTest {
    @Test
    public void logSpiTest() {
        for (Logger logger : ServiceLoader.load(Logger.class)) {
            LoggerTarget loggerTarget = logger.getClass().getAnnotation(LoggerTarget.class);
            System.out.println(loggerTarget.value());
        }
    }
}
