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

public class Patient extends Person {
    private int age;
    private String occupation;
    private String medicalHistory;
    private String patientID;
    private MedicalRecord medicalRecord;

    public Patient(String name, int age, String email, String occupation, String medicalHistory, String patientID) {
        super(name, email);
        this.age = age;
        this.occupation = occupation;
        this.medicalHistory = medicalHistory;
        this.patientID = patientID;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getPatientID() {
        return patientID;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public void visitDoctor(Doctor doctor, MedicalRecord record) {
        System.out.println(getName() + " visited " + doctor.getName());
    }
}
