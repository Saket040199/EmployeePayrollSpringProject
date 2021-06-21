package com.bl.EmployeePayrollSpringProject.employeepayrollDTO;

public class EmployeePayrollDTO {

	public String name;
	public Long salary;
	public EmployeePayrollDTO(String name, Long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", salary=" + salary + "]";
	}
	
}
