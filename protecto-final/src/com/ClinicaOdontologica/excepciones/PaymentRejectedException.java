package com.ClinicaOdontologica.excepciones;

//Excepción lanzada cuando un pago no puede ser procesado.

public class PaymentRejectedException extends Exception {

    public PaymentRejectedException() {
        super("El pago no pudo ser procesado.");
    }

    public PaymentRejectedException(String message) {
        super(message);
    }
}
