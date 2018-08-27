package com.violin.model.userinfo;
import java.util.Date;
import java.io.Serializable;


public class UserInfo implements Serializable {
private int id; // id

private String realName; // 真是姓名

private String nickName; // 昵称

private String images; // 头像

private int sex; // 性别

private int age; // 年龄

private String phone; // 联系方式

private Date registerTime; // 注册时间


	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;	}

	public String getImages() {
		return this.images;
	}
	public void setImages(String images) {
		this.images = images;	}

	public int getSex() {
		return this.sex;
	}
	public void setSex(int sex) {
		this.sex = sex;	}

	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;	}

	public Date getRegisterTime() {
		return this.registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;	}


}
