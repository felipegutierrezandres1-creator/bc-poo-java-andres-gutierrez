package com.Clinica8;

import com.Clinica8.Modelo.*;
import com.Clinica8.Servicio.*;
import com.Clinica8.Excepciones.*;

import java.util.List;
import java.util.Map;

public class Main8 {

    public static void main(String[] args) {

        // Crear gestores
        Clinic8 clinic = new Clinic8();
        PaymentManager8 paymentManager = new PaymentManager8();

        try {
            // Crear pacientes
            Patient8 p1 = new Patient8("María Pérez", "1000035437", "3175562627", "maria.perez@gmail.com");
            Patient8 p2 = new Patient8("Carlos Gómez", "20916453");

            // Crear dentistas
            Dentist8 d1 = new Dentist8("Dr. Gómez", "1001", "Orthodontics", "OP-5534");
            Dentist8 d2 = new Dentist8("Dr. López", "1002", "Endodontics", "OP-8891");

            // Crear tratamientos
            DentalTreatment8 t1 = new DentalTreatment8("Dental Cleaning", 90000, 30);
            DentalTreatment8 t2 = new DentalTreatment8("Orthodontics", 2500000, 45);

            // Crear citas
            DentalAppointment8 a1 = new DentalAppointment8("APPT-001", p1, d1, t1, "2025-10-31", "08:00 AM");
            DentalAppointment8 a2 = new DentalAppointment8("APPT-002", p2, d2, t2, "2025-11-01", "09:30 AM");
            DentalAppointment8 a3 = new DentalAppointment8(); // cita vacía

            // Agregar citas a la clínica
            clinic.addAppointment(a1);
            clinic.addAppointment(a2);
            clinic.addAppointment(a3);

            // Procesar pagos
            paymentManager.processPayment(a1, t1.getCost());
            paymentManager.processPayment(a2, t2.getCost());

            // Mostrar todas las citas
            System.out.println("\n=== LISTA DE CITAS ===");
            for (DentalAppointment8 a : clinic.getAllAppointments()) {
                a.printInfo();
            }

            // Estadísticas de la clínica
            System.out.println("\nTotal de citas: " + clinic.totalAppointments());
            System.out.println("Conteo por tratamiento:");
            Map<String, Integer> count = clinic.countByTreatment();
            for (Map.Entry<String, Integer> entry : count.entrySet()) {
                System.out.println("  " + entry.getKey() + ": " + entry.getValue());
            }

            // Estadísticas de pagos
            System.out.println("\n=== ESTADÍSTICAS DE PAGOS ===");
            System.out.println("Total de pagos: $" + paymentManager.totalPayments());
            System.out.println("Pago promedio: $" + paymentManager.averagePayment());
            System.out.println("Cantidad de pagos: " + paymentManager.totalPaymentsCount());

            // Búsqueda de una cita por ID
            System.out.println("\n=== BÚSQUEDA DE CITA APPT-002 ===");
            DentalAppointment8 found = clinic.findById("APPT-002");
            found.printInfo();

            // Filtrar citas por dentista
            System.out.println("\n=== CITAS DEL DENTISTA Dr. Gómez ===");
            List<DentalAppointment8> dentistAppointments = clinic.filterByDentist("Dr. Gómez");
            for (DentalAppointment8 a : dentistAppointments) {
                a.printInfo();
            }

        } catch (AppointmentAlreadyExistsException | AppointmentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error de pago: " + e.getMessage());
        }

    }
}
