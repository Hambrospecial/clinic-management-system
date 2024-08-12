package com.hambrospecial.clinic_management_system.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "TBL_PATIENT")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNo;
    private LocalDate dateOfBirth;
    private String insuranceInfo;
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
    @OneToMany(mappedBy = "patient")
    private List<MedicalRecord> medicalRecords;
}
