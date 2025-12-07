package com.ClinicaOdontologica.modelo;
import com.ClinicaOdontologica.modelo.abstractas.*;

public class WhiteningTreatment9 extends DentalProcedure9 {

    public WhiteningTreatment9(String code, String name, int duration, double cost) {
        super(code, name, duration, cost);
    }

    @Override
    public void perform() {
        System.out.println("Realizando blanqueamiento dental...");
    }

    @Override
    public void showDetails() {
        System.out.println("Código: " + getCode() +
                ", Nombre: " + getName() +
                ", Duración: " + getDuration() + " min" +
                ", Costo: $" + getCost());
    }
}