public class Main {
    public static void main(String[] args) {
        // Crear objetos de tipo CitaOdontologica
        CitaOdontologica cita1 = new CitaOdontologica("CITA-001", "María Pérez", "Dr. Gómez", "Limpieza Dental", "31/10/2025", "08:00 AM");
        CitaOdontologica cita2 = new CitaOdontologica("CITA-002", "Carlos Gómez", "Dra. López", "Ortodoncia", "01/02/2025", "09:30 AM");
        CitaOdontologica cita3 = new CitaOdontologica("CITA-003", "Laura Rodríguez", "Dr. Ramírez", "Endodoncia", "08/10/2025", "11:00 AM");

        // Mostrar la información de las citas
        cita1.mostrarDetalles();
        cita2.mostrarDetalles();
        cita3.mostrarDetalles();

        // Crear objetos de tipo Paciente
        Paciente paciente1 = new Paciente("María Pérez", "1000035437", "3175562627", "Maria.perez@gmail.com");
        Paciente paciente2 = new Paciente("Carlos Gómez", "20916453", "3167933953", "Carlos.gomez@gmail.com");
        Paciente paciente3 = new Paciente("Laura Rodríguez", "80476879", "3232880272", "Laura.rodriguez@gmail.com");

        // Mostrar la información de los pacientes
        paciente1.mostrarInfo();
        paciente2.mostrarInfo();
        paciente3.mostrarInfo();
    }
}




