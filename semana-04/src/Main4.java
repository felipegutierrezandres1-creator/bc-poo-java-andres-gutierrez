public class Main4 {
    public static void main(String[] args) {

        // Array polimórfico
        Person[] persons = new Person[3];

        persons[0] = new Dentist3(
                "Dr. Gómez",
                12345,
                "3124567890",
                "gomez@clinic.com",
                "Orthodontics",
                "LIC-5543"
        );

        persons[1] = new Client3(
                "Laura Martínez",
                998877,
                "3005678901",
                "laura@gmail.com",
                "María Martínez",
                "3101234567",
                "Dolor de Muelas"
        );

        persons[2] = new Dentist3(
                "Dra. López",
                56789,
                "3209876543",
                "lopez@clinic.com",
                "Endodontics",
                "LIC-8832"
        );

        // Polimorfismo en acción
        for (Person p : persons) {
            p.showPersonInfo();
        }
    }
}
