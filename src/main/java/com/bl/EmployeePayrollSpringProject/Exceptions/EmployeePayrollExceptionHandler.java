package com.bl.EmployeePayrollSpringProject.Exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bl.EmployeePayrollSpringProject.employeepayrollDTO.ResponseDTO;

@ControllerAdvice
public class EmployeePayrollExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseDTO> handleMethodArgumentNotValidException(
			                            MethodArgumentNotValidException exception) {
		List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
		List<String> errMsg = errorList.stream()
				              .map(objErr -> objErr.getDefaultMessage())
				              .collect(Collectors.toList());
		ResponseDTO responseDTO = new ResponseDTO("Exception while processing REST Request",errMsg);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
		}
	
	@ExceptionHandler(EmployeePayrollException.class)
	public ResponseEntity<ResponseDTO> handleAddressBookException(
            EmployeePayrollException exception) {
   ResponseDTO responseDTO =new ResponseDTO("Exception while processing REST Request",exception.getMessage());
   return new ResponseEntity<ResponseDTO> (responseDTO, HttpStatus.BAD_REQUEST);
   }
	
	private static final String message = "Exception while processing REST Request";
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<ResponseDTO> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception){
		ResponseDTO dto = new ResponseDTO("Exception while processing REST Request","Date is not in valid form ! ! Enter in dd MMM yyyy format");
		return new ResponseEntity<ResponseDTO>(dto, HttpStatus.BAD_REQUEST);
	}

}
