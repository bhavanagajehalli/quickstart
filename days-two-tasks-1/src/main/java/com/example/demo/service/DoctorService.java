package com.example.demo.service;

import java.util.Set;


import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repos.DoctorRepository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@AllArgsConstructor
@Data
public class DoctorService {
	private DoctorRepository repo;
	public Doctor add(Doctor entity ) {
		return this.repo.save(entity);
	}
		
		public Doctor findById(int id)throws ElementNotFoundException{
			return this.repo.findById(id).orElseThrow(()->new ElementNotFoundException("ERR-102", "Element Not found"));
		}
	

}
