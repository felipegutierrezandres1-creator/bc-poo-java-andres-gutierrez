public class Dentist3 extends Person {
    private String specialty;
    private String professionalLicense;

    public Dentist3(String fullName ,int idNumber ,String PhoneNumber ,String email,String specialty, String professionalLicense){
        super(fullName,idNumber,PhoneNumber,email);
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
