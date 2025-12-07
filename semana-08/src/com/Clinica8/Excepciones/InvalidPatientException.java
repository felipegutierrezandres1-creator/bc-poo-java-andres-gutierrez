package com.Clinica8.Excepciones;

public class InvalidPatientException extends Exception {
    public InvalidPatientException(String message) {
        super("Paciente inválido: " + message);
    }
}

