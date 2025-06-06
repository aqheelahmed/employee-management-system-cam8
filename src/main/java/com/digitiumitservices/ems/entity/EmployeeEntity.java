package com.digitiumitservices.ems.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {

	@Embedded
	private Address address;

	@Id
	private String empEmail;

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int empId;

	private String empName;

	private String empRole;

	private String skillSet;

	private int empSalary;

}
