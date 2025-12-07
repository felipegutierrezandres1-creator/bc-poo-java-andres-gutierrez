package com.ClinicaOdontologica.modelo;
import com.ClinicaOdontologica.modelo.abstractas.*;

// Subclase concreta que hereda de Person9
public class Dentist9 extends Person9 {
    private String specialty;
    private String licenseNumber;

    // Constructor
    public Dentist9(String id, String name, int age, String specialty, String licenseNumber) {
        super(id, name, age);
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
    }

    // Getters y Setters
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    // Implementación del metodo abstracto
    @Override
    public void showInfo() {
        System.out.println("=== Dentist Information ===");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Specialty: " + specialty);
        System.out.println("License Number: " + licenseNumber);
    }
}
