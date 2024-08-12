package com.hambrospecial.clinic_management_system.services;

import com.hambrospecial.clinic_management_system.models.MedicalRecord;
import com.hambrospecial.clinic_management_system.models.Patient;

import java.util.List;

public interface PatientService {
    Patient register(Patient patient);
    List<Patient> search(Patient patient);
    Patient update(Patient patient);
    List<MedicalRecord> getMedicalRecord(Patient patient);
}
