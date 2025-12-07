package com.ClinicaOdontologica;

import com.ClinicaOdontologica.modelo.*;
import com.ClinicaOdontologica.modelo.abstractas.*;
import com.ClinicaOdontologica.servicio.*;

import java.util.*;

public class Main9 {

    private static Scanner sc = new Scanner(System.in);

    // Servicios
    private static PatientService9 patientService = new PatientService9();
    private static AppointmentService9 appointmentService = new AppointmentService9();

    // Dentistas y tratamientos predeterminados
    private static List<Dentist9> dentists = new ArrayList<>();
    private static List<DentalProcedure9> treatments = new ArrayList<>();

    public static void main(String[] args) {
        initializeDentists();
        initializeTreatments();

        int option;
        do {
            showMenu();
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> addPatientAndAppointment();
                case 2 -> listAppointments();
                case 3 -> searchAppointment();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (option != 0);
    }

    private static void showMenu() {
        System.out.println("\n=== SISTEMA DE GESTIÓN CLÍNICA ODONTOLÓGICA ===");
        System.out.println("1. Agendar cita para paciente");
        System.out.println("2. Listar todas las citas");
        System.out.println("3. Buscar cita por código");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void initializeDentists() {
        dentists.add(new Dentist9("D001", "Dr. Juan Pérez", 40, "Higiene", "LIC123"));
        dentists.add(new Dentist9("D002", "Dra. Ana Gómez", 35, "Ortodoncia", "LIC456"));
        dentists.add(new Dentist9("D003", "Dr. Carlos Ruiz", 45, "Endodoncia", "LIC789"));
    }

    private static void initializeTreatments() {
        treatments.add(new CleaningAppointment9("T001", "Limpieza Dental", 30, 80000, null, dentists.get(0)));
        treatments.add(new CleaningAppointment9("T002", "Ortodoncia Básica", 60, 200000, null, dentists.get(1)));
        treatments.add(new CleaningAppointment9("T003", "Endodoncia", 90, 350000, null, dentists.get(2)));
    }

    private static void addPatientAndAppointment() {
        System.out.println("\n--- Datos del Paciente ---");
        System.out.print("ID: "); String id = sc.nextLine();
        System.out.print("Nombre: "); String name = sc.nextLine();
        System.out.print("Edad: "); int age = Integer.parseInt(sc.nextLine());
        System.out.print("Email: "); String email = sc.nextLine();
        System.out.print("Teléfono: "); String phone = sc.nextLine();
        Patient9 patient = new Patient9(id, name, age, email, phone);

        try {
            patientService.addPatient(patient);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("\n--- Tratamientos Disponibles ---");
        for (int i = 0; i < treatments.size(); i++) {
            DentalProcedure9 t = treatments.get(i);
            Dentist9 dentist = ((CleaningAppointment9)t).getDentist();
            System.out.println((i+1) + ". " + t.getName() + " - $" + t.getCost() + " - Dentista: " + dentist.getName());
        }

        System.out.print("Seleccione un tratamiento (número): ");
        int choice = Integer.parseInt(sc.nextLine());
        if(choice < 1 || choice > treatments.size()) {
            System.out.println("Opción inválida.");
            return;
        }

        DentalProcedure9 selectedTreatment = treatments.get(choice - 1);
        Dentist9 assignedDentist = ((CleaningAppointment9)selectedTreatment).getDentist();

        System.out.print("Ingrese código para la cita: "); String code = sc.nextLine();
        System.out.print("Ingrese fecha (dd/mm/yyyy): "); String date = sc.nextLine();

        // Crear cita con paciente y dentista
        CleaningAppointment9 appointment = new CleaningAppointment9(
                code,
                selectedTreatment.getName(),
                selectedTreatment.getDuration(),
                selectedTreatment.getCost(),
                patient,
                assignedDentist
        );

        appointmentService.addAppointment(appointment);
        System.out.println("Cita agendada exitosamente!");
    }

    private static void listAppointments() {
        List<DentalProcedure9> allAppointments = appointmentService.getAllAppointments();
        if (allAppointments.isEmpty()) {
            System.out.println("No hay citas registradas.");
            return;
        }

        System.out.println("\n--- Lista de Citas ---");
        for (DentalProcedure9 appt : allAppointments) {
            appt.showDetails();
        }
    }

    private static void searchAppointment() {
        System.out.print("\nIngrese el código de la cita a buscar: ");
        String code = sc.nextLine();

        DentalProcedure9 appointment = appointmentService.findAppointmentByCode(code);
        if (appointment != null) {
            appointment.showDetails();
        } else {
            System.out.println("No se encontró ninguna cita con ese código.");
        }
    }
}

