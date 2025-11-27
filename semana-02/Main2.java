public class Main2 {
    public static void main(String[] args) {

        Patient p1 = new Patient("María Pérez", "1000035437", "3175562627", "Maria.perez@gmail.com");
        Patient p2 = new Patient("Carlos Gómez", "20916453", "3167933953", "Carlos.gomez@gmail.com");

        Dentist d1 = new Dentist("Dr. Gómez", "Orthodontics", "OP-5534");
        Dentist d2 = new Dentist("Dr. López", "Endodontics", "OP-8891");

        DentalTreatment t1 = new DentalTreatment("Dental Cleaning", 90000, 30);
        DentalTreatment t2 = new DentalTreatment("Orthodontics", 2500000, 45);

        DentalAppointment appointment1 = new DentalAppointment(
                "APPT-001", p1, d1, t1, "2025-10-31", "08:00 AM"
        );

        DentalAppointment appointment2 = new DentalAppointment(
                "APPT-002", p2, d2, t2, "2025-11-01", "09:30 AM"
        );

        Clinic clinic = new Clinic("Healthy Smiles");
        clinic.addAppointment(appointment1);
        clinic.addAppointment(appointment2);

        clinic.showAppointments();
        System.out.println("Total registered appointments: " + clinic.countAppointments());
    }
}
