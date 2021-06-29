package com.bl.EmployeePayrollSpringProject.employeepayrollDTO;


import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EmployeePayrollDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message= " InValid Name")
	public String name;
    
    @Min(value=500, message="Salary is less than 500")
    @Max(value=1000000, message="Salary cannot be greater than 1000000")
	public long salary;
    
    @Pattern(regexp = "male|female",message = "Gender need to be male or female")
    public String gender;
    
    @JsonFormat(pattern="dd MMM yyyy")
    @NotNull(message="StartDate should not be blank")
    @PastOrPresent
    public LocalDate startDate;
    
    @NotBlank(message="Note should not be blank")
    public String note;
    
    @NotBlank(message="Profile should not be blank")
    public String profile;
    
    @NotNull(message="Department should not be blank")
    public List<String> department;
    
    
	
	public EmployeePayrollDTO() {
		// TODO Auto-generated constructor stub
	}



	public EmployeePayrollDTO( String name,
			 long salary,
			String gender, LocalDate startDate, String note, String profile, List<String> department) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.startDate = startDate;
		this.note = note;
		this.profile = profile;
		this.department = department;
	}
	
	
	
}
