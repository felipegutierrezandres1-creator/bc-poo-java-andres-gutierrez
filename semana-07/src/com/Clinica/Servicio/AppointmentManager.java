package com.Clinica.Servicio;

import com.Clinica.Modelo.Appointment7;
import com.Clinica.Modelo.Dentist7;
import com.Clinica.Modelo.Patient7;
import com.Clinica.Excepciones.AvailabilityException;
import com.Clinica.Excepciones.InvalidAppointmentException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AppointmentManager {

    private List<Appointment7> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    // Crear cita
    public void createAppointment(Appointment7 appointment)
            throws InvalidAppointmentException, AvailabilityException {

        if (appointment.getPatient() == null || appointment.getDentist() == null) {
            throw new InvalidAppointmentException("Appointment must have a patient and a dentist.");
        }

        if (appointment.getDate() == null || !appointment.validateDate((String) appointment.getDate())) {
            throw new InvalidAppointmentException("Invalid date format. Use YYYY-MM-DD.");
        }

        if (appointment.getTime() == null || !appointment.validateTime(appointment.getTime())) {
            throw new InvalidAppointmentException("Invalid time format. Use HH:MM.");
        }

        // Ejemplo ficticio: no trabaja domingos
        LocalDate date = LocalDate.parse((CharSequence) appointment.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            throw new AvailabilityException("Dentist does not work on Sundays.");
        }


        // Verificar disponibilidad del dentista
        long count = appointments.stream()
                .filter(a -> a.getDentist().getIdNumber() == appointment.getDentist().getIdNumber()
                        && a.getDate().equals(appointment.getDate())
                        && a.getTime().equals(appointment.getTime()))
                .count();

        if (count > 0) {
            throw new AvailabilityException("Dentist already has an appointment at this date and time.");
        }

        appointments.add(appointment);
        System.out.println("✅ Appointment scheduled successfully: " + appointment.getId());
    }

    // Cancelar cita por ID
    public void cancelAppointment(String appointmentId) {
        Optional<Appointment7> toRemove = appointments.stream()
                .filter(a -> a.getId().equals(appointmentId))
                .findFirst();

        if (toRemove.isPresent()) {
            appointments.remove(toRemove.get());
            System.out.println("✅ Appointment canceled: " + appointmentId);
        } else {
            System.err.println("❌ Appointment not found: " + appointmentId);
        }
    }

    // Listar todas las citas
    public void listAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            appointments.forEach(Appointment7::print);
        }
    }

    // Buscar citas por paciente
    public List<Appointment7> findAppointmentsByPatient(String patientName) {
        List<Appointment7> result = new ArrayList<>();
        for (Appointment7 a : appointments) {
            if (a.getPatient().getFullName().equalsIgnoreCase(patientName)) {
                result.add(a);
            }
        }
        return result;
    }

    // Buscar citas por dentista
    public List<Appointment7> findAppointmentsByDentist(Dentist7 dentist) {
        List<Appointment7> result = new ArrayList<>();
        for (Appointment7 a : appointments) {
            if (a.getDentist().getIdNumber() == dentist.getIdNumber()) {
                result.add(a);
            }
        }
        return result;
    }

    // Mostrar resumen rápido de todas las citas
    public void showSummary() {
        System.out.println("=== Appointments Summary ===");
        for (Appointment7 a : appointments) {
            a.showSummary();
        }
    }

    // Contar citas por paciente
    public long countAppointmentsByPatient(Patient7 patient) {
        return appointments.stream()
                .filter(a -> a.getPatient().getIdNumber() == patient.getIdNumber())
                .count();
    }
}


