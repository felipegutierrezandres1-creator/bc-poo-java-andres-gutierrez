package com.Clinica8.Excepciones;

public class AppointmentNotFoundException extends Exception {
    public AppointmentNotFoundException(String appointmentId) {
        super("No se encontró ninguna cita con ID '" + appointmentId + "'.");
    }
}
