package com.example.employeeSpringBoot.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String details;
	
}
