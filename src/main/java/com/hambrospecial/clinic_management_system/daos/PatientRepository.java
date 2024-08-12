package com.hambrospecial.clinic_management_system.daos;

import com.hambrospecial.clinic_management_system.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
