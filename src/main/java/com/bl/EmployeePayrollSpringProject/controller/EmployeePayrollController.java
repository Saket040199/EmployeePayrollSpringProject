package com.bl.EmployeePayrollSpringProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bl.EmployeePayrollSpringProject.Model.EmployeePayrollData;
import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.EmployeePayrollDTO;
import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.ResponseDTO;

@RestController
@RequestMapping("/employeepayroll")
public class EmployeePayrollController {

	@RequestMapping(value= {"","/"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Tanya",50000));
		ResponseDTO respDTO = new ResponseDTO("Get Call Success", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}


	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int addId){
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Tanya", 50000));
		ResponseDTO respDTO = new ResponseDTO("Get Call Success", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}


	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Create EmployeePayroll Data Successfull", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}


	@PutMapping("/update/{empId}")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("empId") int empId, @RequestBody EmployeePayrollDTO employeePayrollDTO){
		EmployeePayrollData employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		ResponseDTO respDTO = new ResponseDTO("Create AddressBOOK Data Successfull", employeePayrollData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}


	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId){
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully", "Deleted ID: " + empId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
