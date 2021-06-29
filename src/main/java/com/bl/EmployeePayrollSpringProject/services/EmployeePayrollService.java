package com.bl.EmployeePayrollSpringProject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.EmployeePayrollSpringProject.Exceptions.EmployeePayrollException;
import com.bl.EmployeePayrollSpringProject.Model.EmployeePayrollData;
import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.EmployeePayrollDTO;
import com.bl.EmployeePayrollSpringProject.repository.EmployeePayrollRepository;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
	
	@Autowired
	private EmployeePayrollRepository employeeRepository;

	private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
	
	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return employeeRepository.findAll();
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		// TODO Auto-generated method stub
		return employeeRepository
				.findById(empId)
				.orElseThrow(() -> new EmployeePayrollException("Data Not found !! InvalidId"));
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
		return employeeRepository.save(employeePayrollData);
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
        employeePayrollData.updateEmployeePayrollData(employeePayrollDTO);
        return employeeRepository.save(employeePayrollData);
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
        EmployeePayrollData employeePayrollData = employeePayrollList.stream()
				.filter(empData -> empData.getEmployeePayrollId() == empId)
				.findFirst()
				.orElseThrow(() -> new EmployeePayrollException("Delete cannot be successfull !! InvalidId"));	
	int delete = employeePayrollList.indexOf(employeePayrollData);
	employeePayrollList.remove(delete);
	}

}
