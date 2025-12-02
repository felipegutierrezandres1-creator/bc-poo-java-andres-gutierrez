public class Person {
    protected String fullName;
    protected int idNumber;
    protected String PhoneNumber;
    protected String email;
//constructor
    public Person(String fullName ,int idNumber ,String PhoneNumber ,String email) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.PhoneNumber = PhoneNumber;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void showPersonInfo() {
        System.out.println("Name:" + fullName);
        System.out.println("ID Number:" + idNumber);
        System.out.println("Phone Number:" + PhoneNumber);
        System.out.println("Email:" + email);
    }
}
