import java.util.Date;
import java.text.SimpleDateFormat;

public class Payment {
    private String paymentID;
    private double amount;
    private Date date;
    private Patient patient;
    private String method; // e.g., Cash, Credit, Insurance

    // Constructor
    public Payment(String paymentID, double amount, Date date, Patient patient, String method) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.date = date;
        this.patient = patient;
        this.method = method;
    }

    // Process the payment (placeholder logic)
    public void process() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = (date != null) ? sdf.format(date) : "N/A";
        System.out.println("Payment processed:");
        System.out.println("ID: " + paymentID);
        System.out.println("Patient: " + (patient != null ? patient.getName() : "Unknown"));
        System.out.println("Amount: $" + amount);
        System.out.println("Date: " + formattedDate);
        System.out.println("Method: " + method);
    }

    // Getters and setters
    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
