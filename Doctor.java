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
  public class Doctor extends Person {
    private String specialty;
    private String workingHours;

    public Doctor(String name, String specialty, String workingHours, String email) {
        super(name, email);
        this.specialty = specialty;
        this.workingHours = workingHours;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
}
    }
}
