package com.hambrospecial.clinic_management_system.services;

import com.hambrospecial.clinic_management_system.models.Doctor;
import com.hambrospecial.clinic_management_system.models.Schedule;
import com.hambrospecial.clinic_management_system.models.Staff;

public interface StaffService {
    Doctor onboardDoctor(Doctor doctor);
    Staff onboardStaff(Staff staff);
    Schedule setUpSchedule(Schedule schedule, Doctor doctor);
    Doctor updateDoctorProfile(Doctor doctor);
    void addRoleToUser();
    void addPermissionsToRole();

//    Performance Monitoring:  As a clinic manager, I want to view reports on doctor performance and patient feedback
//    so that I can improve our services.

//    Time Tracking: As a staff member, I want to clock in and out using the system
//    so that my work hours are accurately recorded.

//    Leave Management: As a clinic administrator, I want to manage staff leave and absences
//    so that we can maintain appropriate coverage.

//    Report Tracking: As a clinic manager, I want to view reports on doctor performance, patient feedback,
//    and staff productivity so that I can improve our services and operations.

}
