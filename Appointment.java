public class Appointment {
    private String apptDate;
    private String apptTime;
    private String room;
    private Doctor doctor;
    private Patient patient;
    
    public Appointment(String apptDate, String apptTime, String room) {
        this.apptDate = apptDate;
        this.apptTime = apptTime;
        this.room = room;
    }

    // Getters and Setters
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getApptDate() {
        return apptDate;
    }

    public String getApptTime() {
        return apptTime;
    }
    
    public void cancel() {
        // Logic to cancel the appointment
        System.out.println("Appointment on " + apptDate + " at " + apptTime + " has been canceled.");
    }
}
