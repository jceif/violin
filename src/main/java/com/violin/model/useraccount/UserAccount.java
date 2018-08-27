package com.violin.model.useraccount;
import java.util.Date;
import java.io.Serializable;


public class UserAccount implements Serializable {
private int id; // 

private String accountName; // 

private String accountPwd; // 

private int faileTimes; // 

private Date lastTime; // 


	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;	}

	public String getAccountPwd() {
		return this.accountPwd;
	}
	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;	}

	public int getFaileTimes() {
		return this.faileTimes;
	}
	public void setFaileTimes(int faileTimes) {
		this.faileTimes = faileTimes;	}

	public Date getLastTime() {
		return this.lastTime;
	}
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;	}


}
