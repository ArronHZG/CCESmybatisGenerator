package com.bupt.core.supplier.model;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-20
 */
public class TBusinessIndustry {
    private Integer id;

    private Integer parentId;

    /**
     * 行业名称
     */
    private String name;

    /**
     * 行业编号
     */
    private String number;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}