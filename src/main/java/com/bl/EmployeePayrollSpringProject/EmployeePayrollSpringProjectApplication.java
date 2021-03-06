package com.bl.EmployeePayrollSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeePayrollSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeePayrollSpringProjectApplication.class, args);
		log.info("Employee Payroll app started in {} environment",
				  context.getEnvironment().getProperty("environment"));
		log.info("EmployeePayroll DB user is {} ",
				  context.getEnvironment().getProperty("spring.datasource.username"));
	
	
	}

}
