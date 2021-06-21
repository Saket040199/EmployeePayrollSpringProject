package com.bl.EmployeePayrollSpringProject.Model;

import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.EmployeePayrollDTO;

public class EmployeePayrollData {

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

	public int getEmployeePayrollId() {
		return employeePayrollId;
	}

	public void setEmployeePayrollId(int employeePayrollId) {
		this.employeePayrollId = employeePayrollId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
}
