package com.hambrospecial.clinic_management_system.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "TBL_MEDICAL_RECORD")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private String diagnosis;
    private String treatmentPlan;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @OneToMany(mappedBy = "medicalRecord")
    private List<Prescription> prescriptions;
    @OneToMany(mappedBy = "medicalRecord")
    private List<LabTest> labTests;
}
