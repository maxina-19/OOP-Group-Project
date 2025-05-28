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
    private String dosage; // e.g. "500mg", "10ml"
    private int quantityInStock;
    private double pricePerUnit;

    public Medicine(String name, String manufacturer, String dosage, int quantityInStock, double pricePerUnit) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.dosage = dosage;
        this.quantityInStock = quantityInStock;
        this.pricePerUnit = pricePerUnit;
    }

    public void dispense(int quantity) {
        if (quantity <= quantityInStock) {
            quantityInStock -= quantity;
            System.out.println(quantity + " units of " + name + " dispensed.");
        } else {
            System.out.println("Not enough stock for " + name);
        }
    }

    public void restock(int quantity) {
        quantityInStock += quantity;
        System.out.println(name + " restocked. New stock: " + quantityInStock);
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getManufacturer() { return manufacturer; }
    public String getDosage() { return dosage; }
    public int getQuantityInStock() { return quantityInStock; }
    public double getPricePerUnit() { return pricePerUnit; }

    public void setName(String name) { this.name = name; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setDosage(String dosage) { this.dosage = dosage; }
    public void setQuantityInStock(int quantityInStock) { this.quantityInStock = quantityInStock; }
    public void setPricePerUnit(double pricePerUnit) { this.pricePerUnit = pricePerUnit; }
}