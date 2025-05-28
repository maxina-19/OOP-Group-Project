/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author user
 */
import java.util.Date;

public class MedicalRecord {
    private String recordID;
    private String diagnosis;
    private String treatment;
    private Date date;
    private String patientName;

    public MedicalRecord(String recordID, String diagnosis, String treatment, Date date, String patientName) {
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.date = date;
        this.patientName = patientName;
    }

    // Method to update the medical record details
    public void updateRecord(String data) {
        if (data.startsWith("Diagnosis:")) {
            this.diagnosis = data.substring(10);
        } else if (data.startsWith("Treatment:")) {
            this.treatment = data.substring(10);
        }
    }

    // Getters and Setters
    public String getRecordID() { return recordID; }
    public void setRecordID(String recordID) { this.recordID = recordID; }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public String getTreatment() { return treatment; }
    public void setTreatment(String treatment) { this.treatment = treatment; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
}
