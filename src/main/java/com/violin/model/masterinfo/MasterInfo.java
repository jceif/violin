package com.violin.model.masterinfo;
import java.io.Serializable;

public class MasterInfo implements Serializable {
private int id; // 

private String name; // 大师姓名

private String images; // 相关图片

private String desciption; // 介绍

private String createTime; // 录入日期

private int sort; // 排序


	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;	}

	public String getImages() {
		return this.images;
	}
	public void setImages(String images) {
		this.images = images;	}

	public String getDesciption() {
		return this.desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;	}

	public int getSort() {
		return this.sort;
	}
	public void setSort(int sort) {
		this.sort = sort;	}


}
