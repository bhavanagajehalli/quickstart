package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hospital;
import com.example.demo.repos.HospitalRepository;

@Service
public class HospitalService {
private HospitalRepository repo;
@Autowired
public HospitalService(HospitalRepository repo) {
    super();
    this.repo = repo;
}
public Hospital save(Hospital entity) {
    return this.repo.save(entity);
}
public List<Hospital> findAll(){
    return this.repo.findAll();
    
}
public List<Hospital> findByHospitalName(String srchString){
    return this.repo.findByHospitalName(srchString);
    
}
public void  deleteBy(int id){
    this.repo.deleteById(id);
    
}
public Hospital update(Hospital entity) {
    return this.repo.save(entity);
}



}