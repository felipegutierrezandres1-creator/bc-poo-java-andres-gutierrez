package com.Clinica8.Servicio;

import com.Clinica8.Modelo.DentalAppointment8;
import com.Clinica8.Excepciones.AppointmentNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentManager8 {

    private Map<String, Double> paymentsByAppointmentId;
    private List<Double> paymentsHistory;

    public PaymentManager8() {
        paymentsByAppointmentId = new HashMap<>();
        paymentsHistory = new ArrayList<>();
    }

    // Registrar pago de una cita
    public void processPayment(DentalAppointment8 appointment, double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto del pago debe ser mayor a 0");
        }
        paymentsByAppointmentId.put(appointment.getAppointmentId(), amount);
        paymentsHistory.add(amount);
    }

    // Obtener pago por cita
    public double getPayment(String appointmentId) throws AppointmentNotFoundException {
        if (!paymentsByAppointmentId.containsKey(appointmentId)) {
            throw new AppointmentNotFoundException(appointmentId);
        }
        return paymentsByAppointmentId.get(appointmentId);
    }

    // Estadísticas de pagos
    public double totalPayments() {
        double total = 0;
        for (double p : paymentsHistory) {
            total += p;
        }
        return total;
    }

    public double averagePayment() {
        if (paymentsHistory.isEmpty()) return 0;
        return totalPayments() / paymentsHistory.size();
    }

    public int totalPaymentsCount() {
        return paymentsHistory.size();
    }
}

