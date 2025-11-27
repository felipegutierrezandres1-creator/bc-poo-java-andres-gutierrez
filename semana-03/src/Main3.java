public class Main3 {
    public static void main(String[] args) {

        try {
            // Pacientes
            Patient2 p1 = new Patient2("María Pérez", "1000035437", "3175562627", "maria.perez@gmail.com");
            Patient2 p2 = new Patient2("Carlos Gómez", "20916453");
            Patient2 p3 = new Patient2("Usuario Genérico");

            // Dentistas
            Dentist2 d1 = new Dentist2("Dr. Gómez", "Orthodontics", "OP-5534");
            Dentist2 d2 = new Dentist2("Dr. López", "Endodontics");
            Dentist2 d3 = new Dentist2("Nuevo Dentista");

            // Tratamientos
            DentalTreatment2 t1 = new DentalTreatment2("Dental Cleaning", 90000, 30);
            DentalTreatment2 t2 = new DentalTreatment2("Orthodontics", 2500000);
            DentalTreatment2 t3 = new DentalTreatment2("General Revision");

            // Citas
            DentalAppointment2 a1 = new DentalAppointment2("APPT-001", p1, d1, t1, "2025-10-31", "08:00 AM");
            DentalAppointment2 a2 = new DentalAppointment2("APPT-002", p2, d2, t2, "2025-11-01", "09:30 AM");
            DentalAppointment2 a3 = new DentalAppointment2("APPT-003");

            // Clínica
            Clinic2 clinic = new Clinic2("Healthy Smiles");
            clinic.addAppointment(a1);
            clinic.addAppointment(a2);
            clinic.addAppointment(a3);

            // Mostrar citas
            System.out.println("=== LISTA DE CITAS ===");
            for (DentalAppointment2 app : clinic.getAppointments()) {
                System.out.println(app);
            }

            // Total
            System.out.println("\nTotal de citas: " + clinic.getAppointmentCount());

            // Buscar
            System.out.println("\n=== BÚSQUEDA DE CITA APPT-002 ===");
            DentalAppointment2 found = clinic.findById("APPT-002");

            if (found != null) {
                System.out.println("Cita encontrada: " + found);
            } else {
                System.out.println("No existe la cita");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

