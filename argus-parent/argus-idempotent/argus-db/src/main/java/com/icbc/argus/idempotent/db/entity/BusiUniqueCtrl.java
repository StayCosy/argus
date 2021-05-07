package com.icbc.argus.idempotent.db.entity;

import java.util.Date;

/**
 * 防重控制表pojo
 *
 * @author COSY
 * @version 1.0
 * @date 2021/5/1 14:12
 */
public class BusiUniqueCtrl {
    private Long id;

    private String partId;

    private String busiSeqNo;

    private String appSeqNo;

    private String busiStatus;

    private String processingNode;

    private Date lastModifyTime;

    public BusiUniqueCtrl(Long id, String partId, String busiSeqNo, String appSeqNo, String busiStatus, String processingNode, Date lastModifyTime) {
        this.id = id;
        this.partId = partId;
        this.busiSeqNo = busiSeqNo;
        this.appSeqNo = appSeqNo;
        this.busiStatus = busiStatus;
        this.processingNode = processingNode;
        this.lastModifyTime = lastModifyTime;
    }

    public BusiUniqueCtrl() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId == null ? null : partId.trim();
    }

    public String getBusiSeqNo() {
        return busiSeqNo;
    }

    public void setBusiSeqNo(String busiSeqNo) {
        this.busiSeqNo = busiSeqNo == null ? null : busiSeqNo.trim();
    }

    public String getAppSeqNo() {
        return appSeqNo;
    }

    public void setAppSeqNo(String appSeqNo) {
        this.appSeqNo = appSeqNo == null ? null : appSeqNo.trim();
    }

    public String getBusiStatus() {
        return busiStatus;
    }

    public void setBusiStatus(String busiStatus) {
        this.busiStatus = busiStatus == null ? null : busiStatus.trim();
    }

    public String getProcessingNode() {
        return processingNode;
    }

    public void setProcessingNode(String processingNode) {
        this.processingNode = processingNode == null ? null : processingNode.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}