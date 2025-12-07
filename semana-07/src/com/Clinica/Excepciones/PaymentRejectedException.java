package com.Clinica.Excepciones;

public class PaymentRejectedException extends Exception {

    public PaymentRejectedException(String message) {
        super(message);
    }

    public PaymentRejectedException(String message, Throwable cause) {
        super(message, cause);
    }
}