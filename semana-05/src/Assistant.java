public class Assistant extends Person2 {
    private String turn;
    private String area;
    private String supervisorName;

    public Assistant(String fullName, int idNumber, String phoneNumber, String email,
                     int age, String gender, String turn, String area, String supervisorName) {
        super(fullName, idNumber, phoneNumber, email, age, gender);
        this.turn = turn;
        this.area = area;
        this.supervisorName = supervisorName;
    }

    public String getShift() {
        return turn;
    }

    public String getArea() {
        return area;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    @Override
    public void showPersonInfo() {
        super.showPersonInfo();
        System.out.println("Turn: " + turn);
        System.out.println("Area: " + area);
        System.out.println("Supervisor: " + supervisorName);
    }
}
