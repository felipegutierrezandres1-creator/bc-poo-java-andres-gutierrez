package com.ClinicaOdontologica.modelo.interfaces;

//Interfaz para entidades que pueden procesar pagos.

public interface Payable {
    double getAmount();
    void setAmount(double amount);
    void processPayment();
}

