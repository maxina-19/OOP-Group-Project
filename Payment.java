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
//import java.text.SimpleDateFormat;

public class Payment {
    private String paymentID;
    private double amount;
    private Date date;
    private Patient patient;
    private String paymentMethod;

    public Payment(String paymentID, double amount, Date date, Patient patient, String paymentMethod) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.date = date;
        this.patient = patient;
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
