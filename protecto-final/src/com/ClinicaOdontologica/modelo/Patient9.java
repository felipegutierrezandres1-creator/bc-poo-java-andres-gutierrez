package com.ClinicaOdontologica.modelo;
import com.ClinicaOdontologica.modelo.abstractas.*;

// Subclase concreta que hereda de Person9
public class Patient9 extends Person9 {
    private String email;
    private String phone;

    // Constructor
    public Patient9(String id, String name, int age, String email, String phone) {
        super(id, name, age);
        this.email = email;
        this.phone = phone;
    }

    // Getters y Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Implementación del metodo abstracto
    @Override
    public void showInfo() {
        System.out.println("=== Patient Information ===");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
