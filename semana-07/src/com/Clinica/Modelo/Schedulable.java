package com.Clinica.Modelo;

public interface Schedulable {
    boolean validateDate(String date);
    boolean validateTime(String time);
}
//Para cualquier cosa que pueda agendarse en el sistema.