package com.example.demo.service;

import java.io.PrintWriter;

import java.util.Set;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//unchecked Exception=> can Handle or Declare ,can leave it without handle or declare
@AllArgsConstructor
@Getter
@Setter
@Data

public class ElementNotFoundException extends RuntimeException {
	String errorCode;
	String message;
	@Override
	public void printStackTrace(PrintWriter s) {
		// TODO Auto-generated method stub
		s.write(this.errorCode+","+this.message);
	}
	
//	public ElementNotFoundException(String string,String string2) {
//		
//	}

	

}
