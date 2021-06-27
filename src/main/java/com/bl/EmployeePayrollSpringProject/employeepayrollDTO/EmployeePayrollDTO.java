package com.bl.EmployeePayrollSpringProject.employeepayrollDTO;

public class EmployeePayrollDTO {

	public String name;
	public long salary;
	public EmployeePayrollDTO(String name, long i) {
		super();
		this.name = name;
		this.salary = i;
	}
	public EmployeePayrollDTO() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return " [name=" + name + ", salary=" + salary + "]";
	}
	
}
