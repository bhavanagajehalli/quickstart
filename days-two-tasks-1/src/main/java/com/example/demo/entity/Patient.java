package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="patient_sep_2022")
public class Patient {
	@Id
	@Column(name="patient_id")
	private int patientId;
	@Column(name="patient_name")
	private String patientName;

}
