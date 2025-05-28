/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String contactInfo;
    private String patientType;
    private String medicalHistory;
    private String id;
    private MedicalRecord medicalRecord;
    private ArrayList<Appointment> appointments;  // List to store appointments
    private ArrayList<Prescription> prescriptions;  // List to store prescriptions

    public Patient(String name, int age, String contactInfo, String patientType, String medicalHistory, String id) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
        this.patientType = patientType;
        this.medicalHistory = medicalHistory;
        this.id = id;
        this.appointments = new ArrayList<>();
        this.prescriptions = new ArrayList<>();
    }

    // Register the patient
    public void register() {
        System.out.println("Patient " + name + " registered.");
    }

    // Visit a doctor (consultation and treatment)
    public void visitDoctor(Doctor doctor, MedicalRecord record) {
        doctor.consult(this, record);
        doctor.prescribe(this, record, "Treatment for condition X");
    }

    // Schedule an appointment
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        appointment.setPatient(this);
        System.out.println("Appointment scheduled for " + this.name + " on " + appointment.getApptDate() + " at " + appointment.getApptTime());
    }

    // Receive a prescription
    public void receivePrescription(Prescription prescription) {
        prescriptions.add(prescription);
        System.out.println("Prescription issued to " + this.name + ": " + prescription.getInstructions());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }
}