package com.Clinica8.Modelo;
import com.Clinica8.Util.*;


public class DentalTreatment8 implements Identifiable, Printable {
    private String name;
    private double cost;
    private int durationMinutes;

    public DentalTreatment8(String name, double cost, int durationMinutes) {
        this.name = name;
        this.cost = cost;
        this.durationMinutes = durationMinutes;
    }

    public DentalTreatment8(String name, double cost) {
        this(name, cost, 0);
    }

    public DentalTreatment8(String name) {
        this(name, 0, 0);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }

    @Override
    public String getId() {
        return name; // El nombre del tratamiento es único
    }

    @Override
    public void printInfo() {
        System.out.println(name + " - $" + cost + " - " + durationMinutes + " min");
    }
}
