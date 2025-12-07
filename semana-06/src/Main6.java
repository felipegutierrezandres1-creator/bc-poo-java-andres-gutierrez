import Implementaciones.Appointment6;
import Implementaciones.Assistant6;
import Implementaciones.Dentist6;
import Implementaciones.Patient6;

public class Main6 {
    public static void main(String[] args) {

        // CREACION DE OBJETOS PERSONALES

        Patient6 p1 = new Patient6(
                "María Pérez",
                1001,
                "3105551234",
                "maria@gmail.com",
                28,
                "Femenino",
                "Gingivitis"
        );

        Patient6 p2 = new Patient6(
                "Carlos Gómez",
                1002,
                "3158884422",
                "carlos@gmail.com",
                32,
                "Masculino",
                "Bruxismo"
        );

        Dentist6 d1 = new Dentist6(
                "Dr. Ramírez",
                2001,
                "3125559988",
                "ramirez@clinic.com",
                45,
                "Masculino",
                "Ortodoncia",
                5
        );

        Assistant6 a1 = new Assistant6(
                "Laura Sánchez",
                3001,
                "3201122334",
                "laura@clinic.com",
                26,
                "Femenino",
                "Mañana",
                "Dr. Ramirez"
        );

        // CREACIÓN DE CITAS

        Appointment6 c1 = new Appointment6(
                "001",
                p1,
                d1,
                a1,
                "2025-01-10",
                "10:00",
                "Limpieza Dental"
        );

        Appointment6 c2 = new Appointment6(
                "002",
                p2,
                d1,
                a1,
                "2025-01-14",
                "15:30",
                "Revisión general"
        );

        // POLIMORFISMO: LLAMAMOS MÉTODOS DE INTERFACES

        System.out.println("\n=== VALIDANDO FECHAS ===");
        System.out.println("Fecha válida c1: " + c1.validateDate("2025-01-10"));
        System.out.println("Hora válida c1: " + c1.validateTime("10:00"));

        System.out.println("\n=== GUARDANDO CITAS ===");
        c1.save();
        c2.save();

        // MOSTRAR INFORMACIÓN COMPLETA

        System.out.println("\n=== MOSTRAR CITA COMPLETA ===");
        c1.print();

        System.out.println("\n=== MOSTRAR OTRA CITA COMPLETA ===");
        c2.print();

        // POLIMORFISMO: LLAMAR MÉTODOS DE CLASES PADRE

        System.out.println("\n=== MOSTRAR SOLO INFORMACIÓN BÁSICA ===");
        p1.showBasicInfo();
        d1.showBasicInfo();
        a1.showBasicInfo();

        // RESUMENES DE CITA

        System.out.println("\n=== RESÚMENES ===");
        c1.showSummary();
        c2.showSummary();

        System.out.println("\nFIN DEL PROGRAMA 😎");
    }
}
