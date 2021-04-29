package db;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO
 *
 * @author COSY
 * @version 1.0
 * @date 2021/4/29 19:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:bean.xml"})
public class DbTest {

    @Test
    public void dbRunTest() {
        System.out.println("hello worlds!");
    }
}
