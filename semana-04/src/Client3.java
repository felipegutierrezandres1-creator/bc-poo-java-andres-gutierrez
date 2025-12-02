public class Client3 extends Person {

    private String emergencyContactName;
    private String emergencyContactPhone;
    private String condition; // enfermedad actual o razón de consulta

    public Client3(String fullName, int idNumber, String phoneNumber, String email,
                   String emergencyContactName, String emergencyContactPhone, String condition) {

        super(fullName, idNumber, phoneNumber, email);
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
        this.condition = condition;
    }

    @Override
    public void showPersonInfo() {
        super.showPersonInfo(); // llama al método de Person
        System.out.println("Type: Client");
        System.out.println("Emergency Contact: " + emergencyContactName + " (" + emergencyContactPhone + ")");
        System.out.println("Condition: " + condition);
    }
}
