package com.Clinica8.Modelo;

import com.Clinica8.Util.Person8;

public class Patient8 extends Person8 {
    private String phone;
    private String email;

    public Patient8(String fullName, String documentId, String phone, String email) {
        super(fullName, documentId);
        this.phone = phone;
        this.email = email;
    }

    public Patient8(String fullName, String documentId) {
        this(fullName, documentId, "Sin teléfono", "Sin email");
    }

    public Patient8(String fullName) {
        this(fullName, "Sin documento");
    }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Teléfono: " + phone + " | Email: " + email);
    }
}

