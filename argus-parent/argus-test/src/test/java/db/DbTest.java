package db;

import com.icbc.argus.idempotent.db.entity.BusiUniqueCtrl;
import com.icbc.argus.idempotent.db.service.BusiUniqueCtrlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * TODO
 *
 * @author COSY
 * @version 1.0
 * @date 2021/4/29 19:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class DbTest {

    @Autowired
    BusiUniqueCtrlService busiUniqueCtrlService;

    //@Test
    public void dbRunTest() {
        BusiUniqueCtrl busiUniqueCtrl = new BusiUniqueCtrl();
        busiUniqueCtrl.setBusiSeqNo("B01");
        busiUniqueCtrl.setPartId("01");
        busiUniqueCtrl.setProcessingNode("1-1-1-1");
        busiUniqueCtrl.setAppSeqNo("A01");
        busiUniqueCtrl.setBusiStatus("1");
        busiUniqueCtrl.setLastModifyTime(new Date());
        busiUniqueCtrlService.insertBusiUniqueCtrlRecord(busiUniqueCtrl);
        System.out.println("insert success!");

    }

    @Test
    public void testSearch(){
        BusiUniqueCtrl busiUniqueCtrl = busiUniqueCtrlService.getBusiUniqueCtrl("1");
        if(busiUniqueCtrl != null){
            System.out.println("BusiSeqNo = " + busiUniqueCtrl.getBusiSeqNo());
        }
    }
}
