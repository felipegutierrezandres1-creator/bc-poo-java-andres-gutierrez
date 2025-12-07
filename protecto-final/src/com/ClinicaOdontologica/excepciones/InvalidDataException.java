package com.ClinicaOdontologica.excepciones;

// Excepción lanzada cuando se ingresan datos inválidos por el usuario.
public class InvalidDataException extends Exception {

    public InvalidDataException() {
        super("Los datos ingresados son inválidos.");
    }

    public InvalidDataException(String message) {
        super(message);
    }
}
