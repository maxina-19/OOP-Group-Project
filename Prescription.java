/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

public class Prescription {
    private String prescriptionID;
    private Patient patient;
    private Doctor doctor;
    private Medicine medicine;
    private String dosage;
    private String instructions;

    public Prescription(String prescriptionID, Patient patient, Doctor doctor, Medicine medicine, String dosage, String instructions) {
        this.prescriptionID = prescriptionID;
        this.patient = patient;
        this.doctor = doctor;
        this.medicine = medicine;
        this.dosage = dosage;
        this.instructions = instructions;
    }

    public String getPrescriptionID() {
        return prescriptionID;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public String getDosage() {
        return dosage;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setPrescriptionID(String prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void printPrescription() {
        System.out.println("Prescription ID: " + prescriptionID);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Medicine: " + medicine.getName());
        System.out.println("Dosage: " + dosage);
        System.out.println("Instructions: " + instructions);
    }
}
