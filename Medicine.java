/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.groupproject;

/**
 *
 * @author user
 */
public class Medicine {
    private String name;
    private String manufacturer;
    private String dosage;
    private int quantity;
    private double price;

    public Medicine(String name, String manufacturer, String dosage, int quantity, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.dosage = dosage;
        this.quantity = quantity;
        this.price = price;
    }

    public void dispense(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " units of " + name + " dispensed. Remaining: " + quantity);
        } else {
            System.out.println("Not enough " + name + " in stock.");
        }
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDosage() {
        return dosage;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
