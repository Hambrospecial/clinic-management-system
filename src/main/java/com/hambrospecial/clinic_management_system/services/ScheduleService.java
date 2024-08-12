package com.hambrospecial.clinic_management_system.services;

import com.hambrospecial.clinic_management_system.models.Appointment;
import com.hambrospecial.clinic_management_system.models.AppointmentType;
import com.hambrospecial.clinic_management_system.models.Doctor;
import com.hambrospecial.clinic_management_system.models.WaitList;

import java.util.List;

public interface ScheduleService {
    Appointment bookAppointment(Appointment appointment);
    List<Appointment> getAppointmentByDoctor(Doctor doctor);
    void sendAppointmentReminder(Appointment appointment);
    void cancelAppointment(Appointment appointment);
    Appointment updateAppointment(Appointment appointment);
    AppointmentType createAppointmentType(AppointmentType appointmentType);
    WaitList createWaitList(WaitList waitList);

}
