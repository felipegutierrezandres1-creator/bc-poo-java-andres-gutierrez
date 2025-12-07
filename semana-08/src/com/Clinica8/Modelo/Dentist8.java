package com.Clinica8.Modelo;

import com.Clinica8.Util.Staff;

public class Dentist8 extends Staff {
    private String specialty;

    public Dentist8(String fullName, String documentId, String specialty, String professionalLicense) {
        super(fullName, documentId, professionalLicense);
        this.specialty = specialty;
    }

    public Dentist8(String fullName, String specialty) {
        this(fullName, "Sin documento", specialty, "Sin licencia");
    }

    public Dentist8(String fullName) {
        this(fullName, "Sin especialidad");
    }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    @Override
    public String getName() {
        return fullName;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Especialidad: " + specialty);
    }
}

