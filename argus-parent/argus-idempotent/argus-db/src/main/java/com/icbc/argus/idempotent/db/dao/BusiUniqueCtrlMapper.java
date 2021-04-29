package com.icbc.argus.idempotent.db.dao;

import com.icbc.argus.idempotent.db.entity.BusiUniqueCtrl;

/**
 * @Description 防重控制表DAO层
 * @Date 2021/4/29 15:08
 * @Param
 * @return
 **/
public interface BusiUniqueCtrlMapper {
    /**
     * @return 受影响记录数
     * @Description 按照自增序列删除
     * @Date 2021/4/29 15:09
     * @Param [自增序列ID]
     **/
    int deleteByPrimaryKey(Long id);

    /**
     * @return 受影响记录数
     * @Description 防重实体入库
     * @Date 2021/4/29 15:10
     * @Param [防重实体]
     **/
    int insert(BusiUniqueCtrl record);

    /**
     * @return 受影响记录数
     * @Description 防重实体入库--支持选值
     * @Date 2021/4/29 15:12
     * @Param [防重实体]
     **/
    int insertSelective(BusiUniqueCtrl record);

    /**
     * @return com.icbc.argus.idempotent.db.entity.BusiUniqueCtrl
     * @Description 按照自增序列查询
     * @Date 2021/4/29 15:14
     * @Param [自增序列ID]
     **/
    BusiUniqueCtrl selectByPrimaryKey(Long id);

    /**
     * @return 受影响记录数
     * @Description 防重实体更新--where ID
     * @Date 2021/4/29 15:14
     * @Param [防重实体]
     **/
    int updateByPrimaryKeySelective(BusiUniqueCtrl record);

    /**
     * @return 受影响记录数
     * @Description 防重实体更新--支持自选，where ID
     * @Date 2021/4/29 15:14
     * @Param [防重实体]
     **/
    int updateByPrimaryKey(BusiUniqueCtrl record);
}