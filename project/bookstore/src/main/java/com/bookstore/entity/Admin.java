package com.bookstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")

public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AdminID")
	private int AdminID;

	@Column(name = "UserName")
	private String UserName;

	@Column(name = "Password")
	private String Password;

	@Column(name = "Role")
	private String Role;

	public Admin() {
	}

	public Admin(String userName, String password, String role) {
		super();
		UserName = userName;
		Password = password;
		Role = role;
	}

	public int getAdminID() {
		return AdminID;
	}

	public String getUserName() {
		return UserName;
	}

	public String getPassword() {
		return Password;
	}

	public String getRole() {
		return Role;
	}

	public void setAdminID(int adminID) {
		AdminID = adminID;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public void setRole(String role) {
		Role = role;
	}

	@Override
	public String toString() {
		return "Admin [AdminID=" + AdminID + ", UserName=" + UserName + ", Password=" + Password + ", Role=" + Role
				+ "]";
	}

}
