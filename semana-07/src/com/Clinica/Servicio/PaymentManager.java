package com.Clinica.Servicio;

import com.Clinica.Excepciones.PaymentRejectedException;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    private List<Double> payments = new ArrayList<>();
    private static final double DAILY_LIMIT = 1_000_000;

    // Procesar pago
    public void processPayment(double amount) throws PaymentRejectedException {
        if (amount <= 0) {
            throw new PaymentRejectedException("Amount must be greater than 0.");
        }

        double totalToday = payments.stream().mapToDouble(Double::doubleValue).sum();
        if (totalToday + amount > DAILY_LIMIT) {
            throw new PaymentRejectedException("Payment rejected: exceeds daily limit.");
        }

        payments.add(amount);
        System.out.println("✅ Payment processed: $" + amount);
    }

    // Reembolso
    public void refundPayment(double amount) throws PaymentRejectedException {
        if (!payments.remove(amount)) {
            throw new PaymentRejectedException("Refund failed: payment not found.");
        }
        System.out.println("✅ Payment refunded: $" + amount);
    }

    // Listar pagos
    public void listPayments() {
        System.out.println("=== Payments List ===");
        if (payments.isEmpty()) {
            System.out.println("No payments recorded.");
            return;
        }
        for (Double p : payments) {
            System.out.println("- $" + p);
        }
    }

    // Verificar total del día
    public double getTotalPayments() {
        return payments.stream().mapToDouble(Double::doubleValue).sum();
    }
}
