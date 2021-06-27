package com.bl.EmployeePayrollSpringProject.services;

import java.util.List;

import com.bl.EmployeePayrollSpringProject.Model.EmployeePayrollData;
import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.EmployeePayrollDTO;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeePayrollData();
	
	EmployeePayrollData getEmployeePayrollDataById(int empId);
	
	EmployeePayrollData createEmployeePayrollData( EmployeePayrollDTO employeePayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);
	
	void deleteEmployeePayrollData(int empId);

}
