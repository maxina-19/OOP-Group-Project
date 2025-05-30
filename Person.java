
public class StaffPatient extends Patient {
    public StaffPatient(String name, int age, String contactInfo, String medicalHistory, String id) {
        super(name, age, contactInfo, medicalHistory, id);
    }

    @Override
    public String getPatientType() {
        return "Staff";
    }
    
    @Override
    public void register() {
        System.out.println("Staff " + getName() + " registered with staff benefits.");
    }
}
