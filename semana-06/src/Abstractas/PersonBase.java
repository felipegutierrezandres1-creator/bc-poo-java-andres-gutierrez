package Abstractas;

public abstract class PersonBase {

    protected String fullName;
    protected int idNumber;
    protected String phoneNumber;
    protected String email;
    protected int age;
    protected String gender;

    public PersonBase(String fullName, int idNumber, String phoneNumber,
                      String email, int age, String gender) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public void showBasicInfo() {
        System.out.println("Nombre completo: " + fullName);
        System.out.println("Documento: " + idNumber);
        System.out.println("Teléfono: " + phoneNumber);
        System.out.println("Correo: " + email);
        System.out.println("Edad: " + age);
        System.out.println("Género: " + gender);
    }

    public String getFullName() {
        return fullName;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public abstract void showRole();
}
