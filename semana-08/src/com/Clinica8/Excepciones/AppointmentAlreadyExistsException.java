package com.Clinica8.Excepciones;

public class AppointmentAlreadyExistsException extends Exception {
    public AppointmentAlreadyExistsException(String appointmentId) {
        super("La cita con ID '" + appointmentId + "' ya existe.");
    }
}
