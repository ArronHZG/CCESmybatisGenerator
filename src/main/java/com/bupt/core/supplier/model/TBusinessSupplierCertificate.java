package com.bupt.core.supplier.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-20
 */
public class TBusinessSupplierCertificate {
    private Integer id;

    private Integer supplierId;

    private Integer certificateId;

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

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }
}