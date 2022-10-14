package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	public List<Hospital> findByHospitalName(String qryString);
	public List<Hospital> findAll();



	   //public List<Hospital> deleteByHospital(String srchString);



	    



	}


