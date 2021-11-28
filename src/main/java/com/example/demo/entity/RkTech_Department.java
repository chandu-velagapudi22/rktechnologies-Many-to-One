package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RkTech_Department {
	@Id
	@GeneratedValue
	private Integer deptId;
	private String deptName;
	private String admin;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public RkTech_Department(String deptName, String admin) {
		super();
		this.deptName = deptName;
		this.admin = admin;
	}

	public RkTech_Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}
