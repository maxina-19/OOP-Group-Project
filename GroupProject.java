/*
import java.util.Date;

public class GroupProject {
    public static void main(String[] args) {

        Clinic clinic = new Clinic("IIUM Clinic", "123 Gombak Road", "60-123-123-123");

        Receptionist receptionist = new Receptionist("Lily Shin", "EMP001", "shily@clinic.com", clinic);

        Doctor doctor = new Doctor("Dr. Aizan Fikri", "Cardiology", "9AM-5PM", "fkirie@clinic.com");
        clinic.addDoctor(doctor);

        Patient patient = new StudentPatient("Dina Lana", 30, "dinana@gmail.com", "None", "P001");

        receptionist.registerPatient(patient);

        Appointment appointment = receptionist.scheduleAppointment(patient, doctor, "2025-06-01", "10:15", "No. 7");

        Medicine aspirin = new Medicine("Aspirin", "PharmaCorp", "500mg", 100, 0.50);
        clinic.stockMedicine(aspirin);

        MedicalRecord record = new MedicalRecord("MR001", "", "", new Date(), patient);
        System.out.println("Medical record for patient " + record.getPatient().getName());
        patient.setMedicalRecord(record);
        patient.visitDoctor(doctor, record);
        clinic.addMedicalRecord(record);

        aspirin.dispense(10);

        Payment payment = new Payment("PAY001", 75.00, new Date(), patient, "Credit");
        receptionist.processPayment(payment);
    }
}
