package com.bl.EmployeePayrollSpringProject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bl.EmployeePayrollSpringProject.Model.EmployeePayrollData;
import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.EmployeePayrollDTO;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

	private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
	
	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
      
		return employeePayrollList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		// TODO Auto-generated method stub
		return employeePayrollList.get(empId-1);
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        employeePayrollList.add(employeePayrollData);
		return employeePayrollData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
        employeePayrollData.setName(employeePayrollDTO.name);
        employeePayrollData.setSalary(employeePayrollDTO.salary);
        employeePayrollList.set(empId-1, employeePayrollData);
		return employeePayrollData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
        employeePayrollList.remove(empId);		
	}

}
