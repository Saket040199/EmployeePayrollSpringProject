package com.bl.EmployeePayrollSpringProject.Model;


import java.util.List;

import javax.persistence.Id;

import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.EmployeePayrollDTO;

import lombok.Data;

@Data
public class EmployeePayrollData {

	@Id
	private int employeePayrollId;
	private String name;
	private long salary;
	private String gender;
	private String startDate;
	private String note;
	private String profile;
	private List<String> department;

	
	public EmployeePayrollData() {
		// TODO Auto-generated constructor stub
	}

	public EmployeePayrollData(int employeePayrollId, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.employeePayrollId = employeePayrollId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.gender = employeePayrollDTO.gender;
		this.note = employeePayrollDTO.note;
		this.startDate = employeePayrollDTO.startDate;
		this.profile = employeePayrollDTO.profile;
		this.department = employeePayrollDTO.department;
	}
}
