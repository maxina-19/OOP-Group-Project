/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class Clinic {
    private String name;
    private String address;
    private String phoneNumber;

    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Appointment> appointments;
    private List<MedicalRecord> medicalRecords;
    private List<Medicine> medicines;
    private List<Payment> payments;

    public Clinic(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
        medicalRecords = new ArrayList<>();
        medicines = new ArrayList<>();
        payments = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    public void addMedicalRecord(MedicalRecord record) {
        medicalRecords.add(record);
    }

    public void stockMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }
}
