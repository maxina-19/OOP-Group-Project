/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author user
 */
public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    private String room;
    private boolean canceled;

    public Appointment(Patient patient, Doctor doctor, String date, String time, String room) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.room = room;
        this.canceled = false;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getRoom() {
        return room;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void cancel() {
        if (!canceled) {
            canceled = true;
            System.out.println("Appointment for " + patient.getName() + " with " + doctor.getName() + " on " + date + " at " + time + " has been canceled.");
        } else {
            System.out.println("Appointment already canceled.");
        }
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "patient=" + patient.getName() +
                ", doctor=" + doctor.getName() +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", room='" + room + '\'' +
                ", canceled=" + canceled +
                '}';
    }
}
