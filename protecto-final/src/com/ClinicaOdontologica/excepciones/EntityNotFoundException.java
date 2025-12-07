package com.ClinicaOdontologica.excepciones;

// Excepción lanzada cuando no se encuentra la entidad buscada en el sistema.
public class EntityNotFoundException extends Exception {

    public EntityNotFoundException() {
        super("La entidad no se encontró en el sistema.");
    }

    public EntityNotFoundException(String message) {
        super(message);
    }
}
