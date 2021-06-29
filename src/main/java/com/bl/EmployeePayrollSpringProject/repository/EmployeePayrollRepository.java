package com.bl.EmployeePayrollSpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.EmployeePayrollSpringProject.Model.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {



}
