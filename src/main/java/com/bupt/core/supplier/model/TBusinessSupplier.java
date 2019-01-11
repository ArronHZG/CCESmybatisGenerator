package com.bupt.core.supplier.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-20
 */
public class TBusinessSupplier {
    private Integer id;

    private String name;

    /**
     * 公司简称
     */
    private String abbr;

    private String enName;

    private String contactPerson;

    private String contact;

    private String email;

    /**
     * 机构类型
     */
    private String institutionalCode;

    /**
     * 企业性质
     */
    private String property;

    private String taxNumber;

    /**
     * 注册地址
     */
    private String registerAddress;

    /**
     * 成立日期
     */
    private String registerDate;

    private Integer industryId;

    private String legalPerson;

    /**
     * 行政区域（加地域字段）
     */
    private String region;

    private String province;

    private String city;

    /**
     * 县
     */
    private String district;

    /**
     * 注册资本
     */
    private Integer asset;

    /**
     * 通信地址
     */
    private String mailingAddress;

    /**
     * 经营地址
     */
    private String businessAddress;

    /**
     * 公司主页
     */
    private String homepage;

    /**
     * 经营范围
     */
    private String businessScope;

    private String description;

    private String paymentTime;

    private String createTime;

    private String auditPerson;

    private String auditPhone;

    private String auditEmail;

    /**
     * 尽调人
     */
    private String dueDiligencePerson;

    private String dueDiligencePhone;

    private String dueDiligenceEmail;

    /**
     * 尽调结果
     */
    private String dueDiligenceResult;

    private String dueDeligenceDate;

    private String auditStatus;

    /**
     * 评级报告
     */
    private String auditResult;

    /**
     * 分数
     */
    private Integer creditScore;

    private String creditRating;

    /**
     * 证书id
     */
    private Integer certificateId;

    private String updateTime;

    /**
     * 信评报表
     */
    private String supplierFiles;

    private String reserved1;

    private String reserved2;

    private String auditStartTime;

    private String auditEndTime;

    /**
     * 支付状态
     */
    private String paymentStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr == null ? null : abbr.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getInstitutionalCode() {
        return institutionalCode;
    }

    public void setInstitutionalCode(String institutionalCode) {
        this.institutionalCode = institutionalCode == null ? null : institutionalCode.trim();
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber == null ? null : taxNumber.trim();
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress == null ? null : registerAddress.trim();
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate == null ? null : registerDate.trim();
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getAsset() {
        return asset;
    }

    public void setAsset(Integer asset) {
        this.asset = asset;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress == null ? null : mailingAddress.trim();
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress == null ? null : businessAddress.trim();
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage == null ? null : homepage.trim();
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime == null ? null : paymentTime.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson == null ? null : auditPerson.trim();
    }

    public String getAuditPhone() {
        return auditPhone;
    }

    public void setAuditPhone(String auditPhone) {
        this.auditPhone = auditPhone == null ? null : auditPhone.trim();
    }

    public String getAuditEmail() {
        return auditEmail;
    }

    public void setAuditEmail(String auditEmail) {
        this.auditEmail = auditEmail == null ? null : auditEmail.trim();
    }

    public String getDueDiligencePerson() {
        return dueDiligencePerson;
    }

    public void setDueDiligencePerson(String dueDiligencePerson) {
        this.dueDiligencePerson = dueDiligencePerson == null ? null : dueDiligencePerson.trim();
    }

    public String getDueDiligencePhone() {
        return dueDiligencePhone;
    }

    public void setDueDiligencePhone(String dueDiligencePhone) {
        this.dueDiligencePhone = dueDiligencePhone == null ? null : dueDiligencePhone.trim();
    }

    public String getDueDiligenceEmail() {
        return dueDiligenceEmail;
    }

    public void setDueDiligenceEmail(String dueDiligenceEmail) {
        this.dueDiligenceEmail = dueDiligenceEmail == null ? null : dueDiligenceEmail.trim();
    }

    public String getDueDiligenceResult() {
        return dueDiligenceResult;
    }

    public void setDueDiligenceResult(String dueDiligenceResult) {
        this.dueDiligenceResult = dueDiligenceResult == null ? null : dueDiligenceResult.trim();
    }

    public String getDueDeligenceDate() {
        return dueDeligenceDate;
    }

    public void setDueDeligenceDate(String dueDeligenceDate) {
        this.dueDeligenceDate = dueDeligenceDate == null ? null : dueDeligenceDate.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult == null ? null : auditResult.trim();
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating == null ? null : creditRating.trim();
    }

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getSupplierFiles() {
        return supplierFiles;
    }

    public void setSupplierFiles(String supplierFiles) {
        this.supplierFiles = supplierFiles == null ? null : supplierFiles.trim();
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
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

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus == null ? null : paymentStatus.trim();
    }
}