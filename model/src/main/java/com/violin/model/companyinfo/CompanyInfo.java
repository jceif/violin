package com.violin.model.companyinfo;

import java.io.Serializable;
import java.util.Date;


public class CompanyInfo implements Serializable {
    private int id; //

    private String name; // 名称

    private String address; // 地址

    private String servicePhone; // 服务热线

    private String salePhone; // 销售热线

    private String images; // 相关图片

    private String description; // 公司简介

    private Date updateTime; //


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServicePhone() {
        return this.servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getSalePhone() {
        return this.salePhone;
    }

    public void setSalePhone(String salePhone) {
        this.salePhone = salePhone;
    }

    public String getImages() {
        return this.images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


}
