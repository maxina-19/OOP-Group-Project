/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author user
 */
public class Doctor {
    private String name;
    private String specialty;
    private String availableTimings;
    private String contactInfo;

    public Doctor(String name, String specialty, String availableTimings, String contactInfo) {
        this.name = name;
        this.specialty = specialty;
        this.availableTimings = availableTimings;
        this.contactInfo = contactInfo;
    }

    // Consult a patient and update the medical record
    public void consult(Patient patient, MedicalRecord record) {
        System.out.println("Consulting patient " + patient.getName() + "...");
        record.setDiagnosis("Diagnosis for " + patient.getName());
        System.out.println("Diagnosis: " + record.getDiagnosis());
    }

    // Prescribe treatment and link it to the medical record
    public void prescribe(Patient patient, MedicalRecord record, String treatment) {
        record.setTreatment(treatment);
        Prescription prescription = new Prescription(1, record.getRecordID(), "Take the medicine twice a day.", this);
        patient.receivePrescription(prescription);
        System.out.println("Prescribed treatment: " + treatment + " to " + patient.getName());
    }

    // Create an appointment for a patient
    public Appointment createAppointment(String apptDate, String apptTime, String room) {
        Appointment appointment = new Appointment(apptDate, apptTime, room);
        appointment.setDoctor(this);
        System.out.println("Created appointment for " + apptDate + " at " + apptTime);
        return appointment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAvailableTimings() {
        return availableTimings;
    }

    public void setAvailableTimings(String availableTimings) {
        this.availableTimings = availableTimings;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}