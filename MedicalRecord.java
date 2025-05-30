/*

import java.util.Date;

public class MedicalRecord {
    private String recordID;
    private String diagnosis;
    private String treatment;
    private Date date;
    private Patient patient;

    public MedicalRecord(String recordID, String diagnosis, String treatment, Date date, Patient patient) {
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.date = date;
        this.patient = patient;
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
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
