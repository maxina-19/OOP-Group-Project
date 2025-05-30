/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.groupproject;

/**
 *
 * @author user
 */
import java.util.Date;
import java.util.Scanner;

public class GroupProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Clinic clinic = new Clinic("IIUM Clinic", "123 Gombak Road", "60-123-123-123");
        Receptionist receptionist = new Receptionist("Lily Shin", "EMP001", "shily@clinic.com", clinic);

        Doctor doctor = new Doctor("Dr. Aizan Fikri", "Cardiology", "9AM-5PM", "fkirie@clinic.com");
        clinic.addDoctor(doctor);

        // Pre-existing patient and appointment
        Patient patient = new Patient("Dina Lana", 30, "dinana@gmail.com", "Student", "None", "P001");
        receptionist.registerPatient(patient);
        Appointment appointment = receptionist.scheduleAppointment(patient, doctor, "2025-06-01", "10:15", "No. 7");

        // Medicine and medical record setup (unchanged)
        Medicine aspirin = new Medicine("Aspirin", "PharmaCorp", "500mg", 100, 0.50);
        clinic.stockMedicine(aspirin);
        MedicalRecord record = new MedicalRecord("MR001", "", "", new Date(), patient.getName());
        patient.setMedicalRecord(record);
        patient.visitDoctor(doctor, record);
        clinic.addMedicalRecord(record);
        aspirin.dispense(10);

        Payment payment = new Payment("PAY001", 75.00, new Date(), patient, "Credit");
        receptionist.processPayment(payment);

        System.out.println("Welcome to IIUM Clinic Management System\n");

        // Option to add a new patient
        System.out.println("Do you want to add a new patient? (yes/no)");
        String addPatientAnswer = scanner.nextLine().trim().toLowerCase();

        if (addPatientAnswer.equals("yes")) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter occupation: ");
            String occupation = scanner.nextLine();

            System.out.print("Enter disease (if any): ");
            String disease = scanner.nextLine();

            System.out.print("Enter patient ID: ");
            String patientID = scanner.nextLine();

            Patient newPatient = new Patient(name, age, email, occupation, disease, patientID);
            receptionist.registerPatient(newPatient);
            System.out.println("New patient registered: " + newPatient.getName());
        }

        // Option to cancel an appointment
        System.out.println("\nDo you want to cancel an appointment? (yes/no)");
        String cancelAnswer = scanner.nextLine().trim().toLowerCase();

        if (cancelAnswer.equals("yes")) {
            if (clinic.getAppointments().isEmpty()) {
                System.out.println("No appointments to cancel.");
            } else {
                System.out.println("Current appointments:");
                int index = 1;
                for (Appointment a : clinic.getAppointments()) {
                    System.out.println(index + ". Patient: " + a.getPatient().getName() +
                            ", Doctor: " + a.getDoctor().getName() +
                            ", Date: " + a.getDate() +
                            ", Time: " + a.getTime() +
                            ", Room: " + a.getRoom());
                    index++;
                }

                System.out.print("Enter the appointment number to cancel: ");
                int cancelIndex = Integer.parseInt(scanner.nextLine());

                if (cancelIndex > 0 && cancelIndex <= clinic.getAppointments().size()) {
                    Appointment toCancel = clinic.getAppointments().get(cancelIndex - 1);
                    receptionist.cancelAppointment(toCancel);
                    System.out.println("Appointment canceled successfully!");
                } else {
                    System.out.println("Invalid appointment number.");
                }
            }
        }

        System.out.println("\nThank you for using IIUM Clinic Management System.");
        scanner.close();
    }
}
