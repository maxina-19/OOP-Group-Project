/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Clinic {
    private String name;
    private String address;
    private String contactNumber;
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Medicine> medicines;
    private ArrayList<MedicalRecord> medicalRecords;

    public Clinic(String name, String address, String contactNumber) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.medicines = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();
    }

    public void registerPatient(Patient patient) {
        patients.add(patient);
        patient.register();
    }

    public void stockMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    
    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public void printClinicInfo() {
        System.out.println("Clinic Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }

    public void scheduleAppointment(Patient patient, Doctor doctor, String apptDate, String apptTime, String room) {
        Appointment appointment = doctor.createAppointment(apptDate, apptTime, room);
        patient.scheduleAppointment(appointment);
    }
    
    public void addMedicalRecord(MedicalRecord record) {
        medicalRecords.add(record);
        System.out.println("Medical record for patient " + record.getPatientName() + " added.");
    }
    
    public ArrayList<MedicalRecord> getRecordsByPatient(String patientName) {
        ArrayList<MedicalRecord> recordsForPatient = new ArrayList<>();
        for (MedicalRecord record : medicalRecords) {
            if (record.getPatientName().equalsIgnoreCase(patientName)) {
                recordsForPatient.add(record);
            }
        }
        return recordsForPatient;
    }
    
    public ArrayList<MedicalRecord> getAllMedicalRecords() {
        return medicalRecords;
    }
}
