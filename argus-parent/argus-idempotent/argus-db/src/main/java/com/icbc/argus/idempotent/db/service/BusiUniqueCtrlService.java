package com.icbc.argus.idempotent.db.service;

import com.icbc.argus.idempotent.db.dao.BusiUniqueCtrlMapper;
import com.icbc.argus.idempotent.db.entity.BusiUniqueCtrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusiUniqueCtrlService {

    @Autowired
    BusiUniqueCtrlMapper busiUniqueCtrlMapper;

    public void insertBusiUniqueCtrlRecord(BusiUniqueCtrl busiUniqueCtrl) {
        try {
            if (busiUniqueCtrl != null) {
                busiUniqueCtrlMapper.insertSelective(busiUniqueCtrl);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public BusiUniqueCtrl getBusiUniqueCtrl(String id){
        if(!id.isEmpty()){
            return busiUniqueCtrlMapper.selectByPrimaryKey(Long.parseLong(id));
        }
        return null;
    }
}
