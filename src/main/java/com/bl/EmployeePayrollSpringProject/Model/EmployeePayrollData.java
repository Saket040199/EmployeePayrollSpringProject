package com.bl.EmployeePayrollSpringProject.Model;

import javax.persistence.Id;

import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.EmployeePayrollDTO;

import lombok.Data;

@Data
public class EmployeePayrollData {

	@Id
	private int employeePayrollId;
	private String name;
	private Long salary;
	
	public EmployeePayrollData() {
		// TODO Auto-generated constructor stub
	}

	public EmployeePayrollData(int employeePayrollId, EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.employeePayrollId = employeePayrollId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
	}
}
