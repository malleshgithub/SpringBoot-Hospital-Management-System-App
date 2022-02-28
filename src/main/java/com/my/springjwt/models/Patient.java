package com.my.springjwt.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "patients")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "patientname")
	private String patientname;

	@Column(name = "gender")
	private String gender;

	@Column(name = "email")
	private String email;

	@Column(name = "hospital")
	private String hospital;

	@Column(name = "specialty")
	private String specialty;

	@Column(name = "active")
	private boolean active;
	
	@NotBlank
	@Column(name = "dusername")
	private String dusername;

	public Patient() {
	}

	public Patient(String patientname, String gender, String email, String hospital, String specialty, boolean active,
			String dusername) {
		super();
		this.patientname = patientname;
		this.gender = gender;
		this.email = email;
		this.hospital = hospital;
		this.specialty = specialty;
		this.active = active;
		this.dusername = dusername;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDusername() {
		return dusername;
	}

	public void setDusername(String dusername) {
		this.dusername = dusername;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", patientname=" + patientname + ", gender=" + gender + ", email=" + email
				+ ", hospital=" + hospital + ", specialty=" + specialty + ", active=" + active + ", dusername="
				+ dusername + "]";
	}

}
