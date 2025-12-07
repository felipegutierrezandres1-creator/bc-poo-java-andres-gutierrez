package com.Clinica8.Excepciones;

public class InvalidDentistException extends Exception {
    public InvalidDentistException(String message) {
        super("Dentista inválido: " + message);
    }
}
