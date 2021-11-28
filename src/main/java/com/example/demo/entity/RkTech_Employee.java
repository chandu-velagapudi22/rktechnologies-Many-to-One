package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RkTech_Employee {
	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private Double empSal;
	@ManyToOne
	private RkTech_Department dob;
}
