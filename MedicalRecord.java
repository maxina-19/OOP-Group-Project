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

    public String getRecordID() {
        return recordID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public Date getDate() {
        return date;
    }

    public String getPatientName() {
        return patientName;
    }
}
