package com.violin.model.producttype;

import java.io.Serializable;
import java.util.Date;


public class ProductType implements Serializable {
private int  id; // 

private String name; // 类型名称

private String description; // 描述

private String images; // 相关图片

private Date createTime; // 


	public int getId() {
		return this.id;
	}
	public void setId(int  id) {
		this. id =  id;	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;	}

	public String getImages() {
		return this.images;
	}
	public void setImages(String images) {
		this.images = images;	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;	}


}
