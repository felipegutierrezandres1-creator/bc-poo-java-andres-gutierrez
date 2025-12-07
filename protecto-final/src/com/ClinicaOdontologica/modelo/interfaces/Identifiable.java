package com.ClinicaOdontologica.modelo.interfaces;

//Interfaz que obliga a las clases a tener un ID único.

public interface Identifiable {
    String getId();
    void setId(String id);
}

