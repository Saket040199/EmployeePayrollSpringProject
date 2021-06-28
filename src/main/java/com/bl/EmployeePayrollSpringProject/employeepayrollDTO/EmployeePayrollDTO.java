package com.bl.EmployeePayrollSpringProject.employeepayrollDTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message= " InValid Name")
	public String name;
    @Min(value=500, message="Salary is less than 500")
    @Max(value=1000000, message="Salary cannot be greater than 1000000")
	public long salary;
	public EmployeePayrollDTO(String name, long i) {
		super();
		this.name = name;
		this.salary = i;
	}
	public EmployeePayrollDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
