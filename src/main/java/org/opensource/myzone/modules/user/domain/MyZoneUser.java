package org.opensource.myzone.modules.user.domain;

import java.sql.Blob;

import org.opensource.myzone.modules.commons.base.BaseBean;

/**
 * MyZoneUser的实体类
 * @author king
 *
 */
public class MyZoneUser extends BaseBean{

	private static final long serialVersionUID = 1L;
	/**用户主键id*/
	private long userId;
	/**用户账号*/
	private String userAccount;
	/**用户邮箱*/
	private String userEmail;
	/**用户电话*/
	private String userPhone;
	/**用户编号*/
	private String userNo;
	/**姓名*/
	private String userName;
	/**密码*/
	private String userPassword;
	/**图片*/
	private Blob userImg;
	/**年龄*/
	private int userBirthday;
	/**性别*/
	private char userSex;
	/**默认地址*/
	private String userAddr;
	/**最后登录的ip*/
	private String lastLoginIpAddr;
	/**装态*/
	private String status;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Blob getUserImg() {
		return userImg;
	}
	public void setUserImg(Blob userImg) {
		this.userImg = userImg;
	}
	public int getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(int userBirthday) {
		this.userBirthday = userBirthday;
	}
	public char getUserSex() {
		return userSex;
	}
	public void setUserSex(char userSex) {
		this.userSex = userSex;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getLastLoginIpAddr() {
		return lastLoginIpAddr;
	}
	public void setLastLoginIpAddr(String lastLoginIpAddr) {
		this.lastLoginIpAddr = lastLoginIpAddr;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
