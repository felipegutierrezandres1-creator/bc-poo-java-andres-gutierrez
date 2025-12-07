package com.ClinicaOdontologica.modelo.interfaces;

//Interfaz para entidades que pueden tener citas o programación.

public interface Schedulable {
    String getDate();
    void setDate(String date);
    String getTime();
    void setTime(String time);
}

