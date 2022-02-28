package com.my.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.my.springjwt.models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

	List<Patient> findByActive(boolean active);
	List<Patient> findByPatientnameContaining(String patientname);
	List<Patient> findByDusernameContaining(String dusername);
}
