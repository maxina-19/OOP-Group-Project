/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Prescription {
    private int prescriptionID;
    private String recordID;
    private String instructions;
    private Doctor doctor;
    private Medicine prescribedMedicine;

    public Prescription(int prescriptionID, String recordID, String instructions, Doctor doctor) {
        this.prescriptionID = prescriptionID;
        this.recordID = recordID;
        this.instructions = instructions;
        this.doctor = doctor;
    }

    public void issuePrescription() {
        System.out.println("Prescription issued with ID: " + prescriptionID + " and instructions: " + instructions);
    }

    public void setMedicine(Medicine medicine) {
        this.prescribedMedicine = medicine;
        System.out.println("Medicine prescribed: " + medicine.getName());
    }

    public void setDosage(String dosage) {
        // Set the dosage for the prescribed medicine
        System.out.println("Dosage: " + dosage);
    }

    public void cancel() {
        // Logic to cancel the prescription
        System.out.println("Prescription ID " + prescriptionID + " has been canceled.");
    }

    // Getters and Setters
    public String getInstructions() {
        return instructions;
    }
    
    public String getRecordID(){
        return recordID;
    }
}
