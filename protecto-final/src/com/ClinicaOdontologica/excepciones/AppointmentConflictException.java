package com.ClinicaOdontologica.excepciones;

// Excepción lanzada cuando se intenta crear una cita que entra en conflicto con otra existente.
public class AppointmentConflictException extends Exception {

    public AppointmentConflictException() {
        super("La cita entra en conflicto con otra existente.");
    }

    public AppointmentConflictException(String message) {
        super(message);
    }
}
