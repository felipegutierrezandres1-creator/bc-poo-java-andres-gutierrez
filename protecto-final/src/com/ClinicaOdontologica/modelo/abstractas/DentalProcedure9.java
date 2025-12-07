package com.ClinicaOdontologica.modelo.abstractas;

// CLASE ABSTRACTA GENERAL PARA PROCEDIMIENTOS DENTALES
public abstract class DentalProcedure9 {
    private String code;
    private String name;
    private int duration; // en minutos
    private double cost;

    // Constructor
    public DentalProcedure9(String code, String name, int duration, double cost) {
        this.code = code;
        this.name = name;
        this.duration = duration;
        this.cost = cost;
    }

    // Getters y Setters
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) {
        if(duration > 0) this.duration = duration;
    }

    public double getCost() { return cost; }
    public void setCost(double cost) {
        if(cost >= 0) this.cost = cost;
    }

    // Metodos abstractos para que cada subclase implemente
    public abstract void perform();
    public abstract void showDetails();
}
