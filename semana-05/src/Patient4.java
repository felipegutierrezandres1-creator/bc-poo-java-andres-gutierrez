public class Patient4 extends Person2 {

    private String medicalCondition;
    private String emergencyContactName;
    private String emergencyContactPhone;

    // Constructor
    public Patient4(String fullName, int idNumber, String phoneNumber, String email,
                    int age, String gender,
                    String medicalCondition, String emergencyContactName, String emergencyContactPhone) {

        super(fullName, idNumber, phoneNumber, email, age, gender);
        this.medicalCondition = medicalCondition;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Getters (si los necesitas)
    public String getMedicalCondition() {
        return medicalCondition;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    @Override
    public void showPersonInfo() {
        super.showPersonInfo(); // Mostrar info básica de Person2
        System.out.println("Medical Condition: " + medicalCondition);
        System.out.println("Emergency Contact Name: " + emergencyContactName);
        System.out.println("Emergency Contact Phone: " + emergencyContactPhone);
    }
}
