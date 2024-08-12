package com.hambrospecial.clinic_management_system.services.impl;

import com.hambrospecial.clinic_management_system.daos.PatientRepository;
import com.hambrospecial.clinic_management_system.models.MedicalRecord;
import com.hambrospecial.clinic_management_system.models.Patient;
import com.hambrospecial.clinic_management_system.services.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    @Override
    public Patient register(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> search(Patient patient) {
        return null;
    }

    @Override
    public Patient update(Patient patient) {
        return null;
    }

    @Override
    public List<MedicalRecord> getMedicalRecord(Patient patient) {
        return null;
    }
}
