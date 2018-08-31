package com.violin.model.violininfo;

import java.io.Serializable;
import java.util.Date;


public class ViolinInfo implements Serializable {
private int id; // 

private String name; // 名称

private String code; // 编号

private Double price; // 价格

private String author; // 制作大事

private String mianBan; // 面板

private String beiBan; // 背板

private String ceBan; // 侧板

private String youQi; // 琴漆

private String qinXian; // 琴弦

private String qinMa; // 琴码

private String qinGong; // 琴弓

private String qinHe; // 琴盒

private String zhiBan; // 指板

private String xianZhou; // 弦轴

private String weiDiao; // 微调

private String weiSheng; // 尾绳

private String description; // 

private String images; // 图片

private Date createTime; // 制作时间

private int viewTimes; // 浏览次数

private String buyUrl; // 购买地址(京东，淘宝）

private Date marketTime; // 上架时间

private int isHot; // 强烈关注 0是，1否


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

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;	}

	public Double getPrice() {
		return this.price;
	}
	public void setPrice(Double price) {
		this.price = price;	}

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;	}

	public String getMianBan() {
		return this.mianBan;
	}
	public void setMianBan(String mianBan) {
		this.mianBan = mianBan;	}

	public String getBeiBan() {
		return this.beiBan;
	}
	public void setBeiBan(String beiBan) {
		this.beiBan = beiBan;	}

	public String getCeBan() {
		return this.ceBan;
	}
	public void setCeBan(String ceBan) {
		this.ceBan = ceBan;	}

	public String getYouQi() {
		return this.youQi;
	}
	public void setYouQi(String youQi) {
		this.youQi = youQi;	}

	public String getQinXian() {
		return this.qinXian;
	}
	public void setQinXian(String qinXian) {
		this.qinXian = qinXian;	}

	public String getQinMa() {
		return this.qinMa;
	}
	public void setQinMa(String qinMa) {
		this.qinMa = qinMa;	}

	public String getQinGong() {
		return this.qinGong;
	}
	public void setQinGong(String qinGong) {
		this.qinGong = qinGong;	}

	public String getQinHe() {
		return this.qinHe;
	}
	public void setQinHe(String qinHe) {
		this.qinHe = qinHe;	}

	public String getZhiBan() {
		return this.zhiBan;
	}
	public void setZhiBan(String zhiBan) {
		this.zhiBan = zhiBan;	}

	public String getXianZhou() {
		return this.xianZhou;
	}
	public void setXianZhou(String xianZhou) {
		this.xianZhou = xianZhou;	}

	public String getWeiDiao() {
		return this.weiDiao;
	}
	public void setWeiDiao(String weiDiao) {
		this.weiDiao = weiDiao;	}

	public String getWeiSheng() {
		return this.weiSheng;
	}
	public void setWeiSheng(String weiSheng) {
		this.weiSheng = weiSheng;	}

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

	public int getViewTimes() {
		return this.viewTimes;
	}
	public void setViewTimes(int viewTimes) {
		this.viewTimes = viewTimes;	}

	public String getBuyUrl() {
		return this.buyUrl;
	}
	public void setBuyUrl(String buyUrl) {
		this.buyUrl = buyUrl;	}

	public Date getMarketTime() {
		return this.marketTime;
	}
	public void setMarketTime(Date marketTime) {
		this.marketTime = marketTime;	}

	public int getIsHot() {
		return this.isHot;
	}
	public void setIsHot(int isHot) {
		this.isHot = isHot;	}


}
