package com.bupt.core.supplier.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-20
 */
public class TBusinessSupplierAudit {
    private Integer id;

    private Integer supplierId;

    /**
     * 缴费完成时间
     */
    private String initTime;

    /**
     * 评审l
     */
    private String type;

    private Integer auditUser;

    private String auditStartTime;

    private String auditEndTime;

    private Integer creditScore;

    /**
     * 初审结果
     */
    private String auditResult;

    private String auditUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getInitTime() {
        return initTime;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime == null ? null : initTime.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(Integer auditUser) {
        this.auditUser = auditUser;
    }

    public String getAuditStartTime() {
        return auditStartTime;
    }

    public void setAuditStartTime(String auditStartTime) {
        this.auditStartTime = auditStartTime == null ? null : auditStartTime.trim();
    }

    public String getAuditEndTime() {
        return auditEndTime;
    }

    public void setAuditEndTime(String auditEndTime) {
        this.auditEndTime = auditEndTime == null ? null : auditEndTime.trim();
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult == null ? null : auditResult.trim();
    }

    public String getAuditUrl() {
        return auditUrl;
    }

    public void setAuditUrl(String auditUrl) {
        this.auditUrl = auditUrl == null ? null : auditUrl.trim();
    }
}