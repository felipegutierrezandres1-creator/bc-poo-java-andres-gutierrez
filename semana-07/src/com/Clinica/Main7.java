package com.Clinica;

import com.Clinica.Modelo.*;
import com.Clinica.Servicio.*;
import com.Clinica.Excepciones.*;

import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("=== Dental Clinic System Demo ===\n");

        // Crear pacientes, dentistas y asistentes
        Patient7 patient1 = new Patient7("John Doe", 101, "3001234567", "john@mail.com", 28, "M", "None");
        Patient7 patient2 = new Patient7("Mary Smith", 102, "3009876543", "mary@mail.com", 35, "F", "Diabetes");

        Dentist7 dentist = new Dentist7("Dr. Ana Lopez", 201, "3005554444", "ana@mail.com", 40, "F", "Orthodontics", 12);
        Assistant7 assistant = new Assistant7("Carlos Perez", 301, "3006667777", "carlos@mail.com", 30, "M", "Support", "Dr. Ana Lopez");

        // Crear gestores
        AppointmentManager appointmentManager = new AppointmentManager();
        PaymentManager paymentManager = new PaymentManager();


        //Crear cita válida

        Appointment7 appt1 = new Appointment7("001", patient1, dentist, assistant, "2025-12-06", "10:00", "Teeth Cleaning");
        try {
            appointmentManager.createAppointment(appt1);
        } catch (InvalidAppointmentException | AvailabilityException e) {
            System.err.println("❌ Error creando la cita: " + e.getMessage());
        }

        //Crear cita en domingo (error)

        Appointment7 appt2 = new Appointment7("002", patient2, dentist, assistant, "2025-12-07", "11:00", "Check-up");
        try {
            appointmentManager.createAppointment(appt2);
        } catch (InvalidAppointmentException | AvailabilityException e) {
            System.err.println("❌ Error creando la cita: " + e.getMessage());
        }


        //Listar todas las citas

        System.out.println("\n--- Listar todas la citas ---");
        appointmentManager.listAppointments();

        //Buscar citas por paciente

        System.out.println("\n--- Citas para John Doe ---");
        List<Appointment7> johnAppointments = appointmentManager.findAppointmentsByPatient("John Doe");
        johnAppointments.forEach(Appointment7::print);

        //Cancelar cita

        System.out.println("\n--- Cancelar cita 001 ---");
        appointmentManager.cancelAppointment("APPT-001");

        // Listar después de cancelación
        System.out.println("\n--- Lista de citas despues de cancelar ---");
        appointmentManager.listAppointments();


        //Procesar pagos válidos y reembolso

        try {
            paymentManager.processPayment(500_000);
            paymentManager.processPayment(300_000);
            paymentManager.refundPayment(300_000);
        } catch (PaymentRejectedException e) {
            System.err.println("❌ Error de pago: " + e.getMessage());
        } finally {
            System.out.println("\nTotal de pagos hoy: $" + paymentManager.getTotalPayments());
        }


        //Pago inválido (error)

        try {
            paymentManager.processPayment(-1000);
        } catch (PaymentRejectedException e) {
            System.err.println("❌ Error de pago: " + e.getMessage());
        }


        //Listar todos los pagos

        System.out.println("\n--- Lista de todos los pagos ---");
        paymentManager.listPayments();

        System.out.println("\n=== FIN DEL PROGRAMA (-.-) ===");
    }
}

