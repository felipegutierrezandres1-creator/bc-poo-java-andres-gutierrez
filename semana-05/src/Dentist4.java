public class Dentist4 extends Person2 {
    private String specialty;
    private String professionalLicense;

    public Dentist4(String fullName, int idNumber, String phoneNumber,
                    String email, int age, String gender, String specialty, String professionalLicense){
        super(fullName,idNumber,phoneNumber,email,age,gender);
        this.specialty = specialty;
        this.professionalLicense = professionalLicense;
    }
    @Override
    public void showPersonInfo() {
        super.showPersonInfo();
        System.out.println("Specialty: " + specialty);
        System.out.println("License: " + professionalLicense);
    }
}

