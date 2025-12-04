public class Main5 {
    public static void main(String[] args) {

        Patient4 p1 = new Patient4(
                "Andrés Gutierrez", 123456, "3001112233", "andres@mail.com",
                22, "Male",
                "Hipertensión", "Juan Gutierrez", "3005544332"
        );

        Patient4 p2 = new Patient4(
                "María Pérez", 789456, "3209988776", "maria@mail.com",
                29, "Female",
                "Alergia al látex", "Laura Pérez", "3124455667"
        );

        Patient4 p3 = new Patient4(
                "Carlos Díaz", 445566, "3157788990", "carlos@mail.com",
                34, "Male",
                "Diabetes tipo 2", "Sofía Díaz", "3102233445"
        );

        Assistant a1 = new Assistant(
                "Daniela Torres", 112233, "3012233445", "daniela@mail.com",
                27, "Female",
                "Mañana", "Odontología", "Dr. Ramírez"
        );

        Assistant a2 = new Assistant(
                "Felipe Gómez", 998877, "3049988776", "felipe@mail.com",
                32, "Male",
                "Tarde", "Ortodoncia", "Dra. Morales"
        );

        Dentist4 d1 = new Dentist4("Dr. Ramírez", 11223344, "3019988776",
                "ramirez@gmail.com", 45, "Male", "Ortodoncia", "OP-2345");

        Dentist4 d2 = new Dentist4("Dra. Camila Ruiz", 22334455, "3001122334",
                "camilaruiz@gmail.com", 38, "Female", "Endodoncia", "OP-8899");

        AppointmentSystem system = new AppointmentSystem();

        // Crear varias citas
        system.createAppointment(p1, "2025-01-10", "10:00", a1, "Limpieza dental");
        system.createAppointment(p1, "2025-01-10", "15:30", a2, "Revisión general");
        system.createAppointment(p2, "2025-01-11", "09:00", a1, "Colocación de brackets");
        system.createAppointment(p3, "2025-01-11", "11:00", a2, "Consulta de ortodoncia");
        system.createAppointment(p2, "2025-01-12", "08:00", a1, "Control de dolor");
        system.createAppointment(p3, "2025-01-12", "14:15", a2, "Ajuste de ortodoncia");

        System.out.println("========== POLYMORPHISM TEST ==========");
        system.showPersonRole(p1);
        system.showPersonRole(a1);
        system.showPersonRole(d1);
        System.out.println();

        System.out.println("========== ALL APPOINTMENTS ==========");
        system.showAppointments();
        System.out.println();

        System.out.println("========== APPOINTMENTS ON 2025-01-10 ==========");
        system.showAppointments("2025-01-10");
        System.out.println();

        System.out.println("========== APPOINTMENTS FOR PATIENT: " + p2.getFullName() + " ==========");
        system.showAppointments(p2);
        System.out.println();

        System.out.println("========== APPOINTMENTS WITH ASSISTANT: " + a2.getFullName() + " ==========");
        system.showAppointments(a2);
        System.out.println();

        System.out.println("TOTAL REGISTERED APPOINTMENTS: " + system.countAppointments());
    }
}
