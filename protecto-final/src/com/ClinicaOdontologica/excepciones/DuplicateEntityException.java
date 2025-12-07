package com.ClinicaOdontologica.excepciones;

//Excepción lanzada cuando se intenta agregar una entidad que ya existe en el sistema.

public class DuplicateEntityException extends Exception {

    public DuplicateEntityException() {
        super("La entidad ya existe en el sistema.");
    }

    public DuplicateEntityException(String message) {
        super(message);
    }
}
