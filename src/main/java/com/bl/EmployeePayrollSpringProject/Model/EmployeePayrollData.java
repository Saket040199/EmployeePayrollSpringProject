package com.bl.EmployeePayrollSpringProject.Model;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.EmployeePayrollDTO;

import lombok.Data;

@Entity
@Table(name = "employee_payroll")
@Data
public class EmployeePayrollData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeePayrollId;
	@Column(name="name")
	private String name;
	private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profile;
	
	@ElementCollection
	@CollectionTable(name= "employee_department",joinColumns = @JoinColumn(name = "id"))
	@Column(name = "department")
	private List<String> department;

	
	public EmployeePayrollData() {
		// TODO Auto-generated constructor stub
	}

	public EmployeePayrollData( EmployeePayrollDTO employeePayrollDTO) {
		super();
		this.updateEmployeePayrollData(employeePayrollDTO);
		
	}

	public void updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.gender = employeePayrollDTO.gender;
		this.note = employeePayrollDTO.note;
		this.startDate = employeePayrollDTO.startDate;
		this.profile = employeePayrollDTO.profile;
		this.department = employeePayrollDTO.department;		
	}
}
