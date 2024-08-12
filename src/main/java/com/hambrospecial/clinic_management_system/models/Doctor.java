package com.hambrospecial.clinic_management_system.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "TBL_DOCTOR")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialization;
    private String contactInfo;
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;
    @OneToMany(mappedBy = "doctor")
    private List<Schedule> schedules;
}
