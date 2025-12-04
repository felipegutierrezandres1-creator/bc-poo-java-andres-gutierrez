//Clase Padre
public class Person2 {
    protected String fullName;
    protected int idNumber;
    protected String phoneNumber;
    protected String email;
    private int age;
    private String gender;

    // Constructor
    public Person2(String fullName, int idNumber, String phoneNumber,
                   String email, int age, String gender) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.gender = gender;
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

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void showPersonInfo() {
        System.out.println("Name: " + fullName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
