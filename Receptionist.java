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
import java.util.List;
public class Receptionist extends Person {
    private String employeeID;
    private Clinic clinic;

    public Receptionist(String name, String employeeID, String email, Clinic clinic) {
        super(name, email);
        this.employeeID = employeeID;
        this.clinic = clinic;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public void registerPatient(Patient patient) {
        System.out.println("Registering patient: " + patient.getName());
        clinic.addPatient(patient);
    }

    public Appointment scheduleAppointment(Patient patient, Doctor doctor, String date, String time, String room) {
        Appointment appointment = new Appointment(patient, doctor, date, time, room);
        clinic.addAppointment(appointment);
        System.out.println("Appointment scheduled for " + patient.getName() + " with " + doctor.getName() + " on " + date + " at " + time);
        return appointment;
    }

    public void cancelAppointment(Appointment appointment) {
        appointment.cancel();
        clinic.removeAppointment(appointment);
    }

    public void processPayment(Payment payment) {
        System.out.println("Processing payment of " + payment.getAmount() + " from " + payment.getPatient().getName());
        clinic.addPayment(payment);
    }
}
