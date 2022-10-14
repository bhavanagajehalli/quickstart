package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Hospital;
import com.example.demo.entity.Patient;
import com.example.demo.service.DoctorService;
import com.example.demo.service.HospitalService;

@SpringBootApplication
public class DaysTwoTasks1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DaysTwoTasks1Application.class, args);
//		Hospital obj=ctx.getBean("tablet",Hospital.class);
//		HospitalService service=ctx.getBean(HospitalService.class);
//		System.out.println("one Product with following Details Added:"+service.save(obj));
//		//service.findByHospitalName("dolo").forEach(System.out::println);
//		//service.deleteBy(102);
//		service.update(obj);
//		service.findAll().forEach(System.out::println);
		Doctor doctor=ctx.getBean(Doctor.class);
		DoctorService service=ctx.getBean(DoctorService.class);
		//service.add(doctor);
		Doctor found =service.findById(982);
		System.out.println("Doctor Name:= "+found.getDoctorName());
		System.out.println("Doctor Department:= "+found.getDepartment());
		System.out.println("List of Patients");
		for(Patient eachPatient: found.getPatients()) {
			System.out.println(eachPatient);
		}
	
		ctx.close();
	}
	@Bean
	public Hospital tablet() {
		return new Hospital(103,"dolo650",2700);
	}
	@Bean
	public Hospital syringe() {
		return new Hospital(102,"syringe",2300);
	}
	@Bean
	public Patient ram() {
		return new Patient(104,"Ram Kumar");
		
	}
	@Bean
	public Patient shyam() {
		return new Patient(108,"Shyam Sundar");
		
	}
	@Bean
	public Doctor rajesh() {
		Set<Patient> patientList = new HashSet<>();
		patientList.add(ram());
		patientList.add(shyam());
		return new Doctor(982,"Rajesh","ent",patientList);
	}

	}


