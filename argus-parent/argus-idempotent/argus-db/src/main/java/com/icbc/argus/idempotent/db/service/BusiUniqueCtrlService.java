package com.icbc.argus.idempotent.db.service;

import com.icbc.argus.idempotent.db.dao.BusiUniqueCtrlMapper;
import com.icbc.argus.idempotent.db.entity.BusiUniqueCtrl;
import com.icbc.argus.log.slf4j.api.RecordLogApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * db操作测试案例
 *
 * @author COSY
 * @version 1.0
 * @date 2021/5/1 14:12
 */
@Service
public class BusiUniqueCtrlService {

    @Autowired
    BusiUniqueCtrlMapper busiUniqueCtrlMapper;

    /**
     * @return void
     * @Description 测试代码
     * @Date 2021/5/7 9:00
     * @Param [busiUniqueCtrl]
     **/
    public void insertBusiUniqueCtrlRecord(BusiUniqueCtrl busiUniqueCtrl) {
        try {
            if (busiUniqueCtrl != null) {
                busiUniqueCtrlMapper.insertSelective(busiUniqueCtrl);
            }
        } catch (Exception e) {
            RecordLogApi.error("测试案例执行失败！", e);
        }
    }

    /**
     * @return void
     * @Description 测试代码
     * @Date 2021/5/7 9:00
     * @Param [busiUniqueCtrl]
     **/
    public BusiUniqueCtrl getBusiUniqueCtrl(String id) {
        RecordLogApi.info("test log config!");
        if (!id.isEmpty()) {
            return busiUniqueCtrlMapper.selectByPrimaryKey(Long.parseLong(id));
        }
        return null;
    }
}
