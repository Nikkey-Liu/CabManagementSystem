package com.web.pojo;

import java.sql.Timestamp;
import java.util.Date;

public  abstract class User {
	private int userid;
	 public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	private Date dob;

	    private String email;


	    private Boolean subscribed;
	   


		private Integer loginattempts;

	    private Boolean locked;

	    private Boolean activated;

	    private Timestamp lastlogin;

	    
	    private String phonenumber;

	   
	    private String address;

	    public Boolean getSubscribed() {
			return subscribed;
		}


		public void setSubscribed(Boolean subscribed) {
			this.subscribed = subscribed;
		}
		public Date getDob() {
			return dob;
		}


		public void setDob(Date dob) {
			this.dob = dob;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public Integer getLoginattempts() {
			return loginattempts;
		}


		public void setLoginattempts(Integer loginattempts) {
			this.loginattempts = loginattempts;
		}


		public Boolean getLocked() {
			return locked;
		}


		public void setLocked(Boolean locked) {
			this.locked = locked;
		}


		public Boolean getActivated() {
			return activated;
		}


		public void setActivated(Boolean activated) {
			this.activated = activated;
		}


		public Timestamp getLastlogin() {
			return lastlogin;
		}


		public void setLastlogin(Timestamp lastlogin) {
			this.lastlogin = lastlogin;
		}


		public String getPhonenumber() {
			return phonenumber;
		}


		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}
}
