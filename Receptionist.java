/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author user
 */

public class Receptionist {
    private String name;
    private String employeeID;
    private String contactInfo;
    private Clinic assignedClinic;

    // Constructor
    public Receptionist(String name, String employeeID, String contactInfo, Clinic assignedClinic) {
        this.name = name;
        this.employeeID = employeeID;
        this.contactInfo = contactInfo;
        this.assignedClinic = assignedClinic;
    }

    // Register a new patient with the clinic
    public void registerPatient(Patient patient) {
        if (assignedClinic != null && patient != null) {
            assignedClinic.registerPatient(patient);
            System.out.println("Patient " + patient.getName() + " registered successfully.");
        } else {
            System.out.println("Error: Unable to register patient. Clinic or patient is null.");
        }
    }

    // Schedule an appointment and return the created Appointment object
    public Appointment scheduleAppointment(Patient patient, Doctor doctor, String date, String time, String room) {
        if (assignedClinic != null && patient != null && doctor != null &&
            date != null && time != null && room != null) {

            Appointment appointment = doctor.createAppointment(date, time, room);
            patient.scheduleAppointment(appointment);
            System.out.println("Appointment scheduled for " + patient.getName() +
                               " on " + date + " at " + time + " in room " + room);
            return appointment;
        } else {
            System.out.println("Error: Missing required information to schedule appointment.");
            return null;
        }
    }

    public void processPayment(Payment payment) {
    if (payment != null) {
        payment.process();
    } else {
        System.out.println("Error: Payment is null.");
    }
}

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Clinic getAssignedClinic() {
        return assignedClinic;
    }

    public void setAssignedClinic(Clinic assignedClinic) {
        this.assignedClinic = assignedClinic;
    }
}
