package com.violin.model.news;

import java.io.Serializable;
import java.util.Date;


public class News implements Serializable {
private int id; // 

private String title; // 标题

private String content; // 内容

private String author; // 作者

private int isShow; // 是否展示 0是 ，1 否

private int isHot; // 特别新闻 0是 ，1 否

private int sort; // 排序

private Date publishTime; // 发布时间


	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;	}

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;	}

	public int getIsShow() {
		return this.isShow;
	}
	public void setIsShow(int isShow) {
		this.isShow = isShow;	}

	public int getIsHot() {
		return this.isHot;
	}
	public void setIsHot(int isHot) {
		this.isHot = isHot;	}

	public int getSort() {
		return this.sort;
	}
	public void setSort(int sort) {
		this.sort = sort;	}

	public Date getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;	}


}
