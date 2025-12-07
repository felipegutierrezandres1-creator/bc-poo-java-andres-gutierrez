package com.ClinicaOdontologica.modelo;

import com.ClinicaOdontologica.modelo.abstractas.DentalProcedure9;

// Clase concreta para citas de limpieza dental
public class CleaningAppointment9 extends DentalProcedure9 {
    private Patient9 patient;
    private Dentist9 dentist;

    // Constructor
    public CleaningAppointment9(String code, String name, int duration, double cost, Patient9 patient, Dentist9 dentist) {
        super(code, name, duration, cost);
        this.patient = patient;
        this.dentist = dentist;
    }

    @Override
    public void perform() {
        System.out.println("Cita de limpieza dental realizada para el paciente: " + patient.getName());
    }

    @Override
    public void showDetails() {
        System.out.println("=== Detalles de la Cita de Limpieza ===");
        System.out.println("Código: " + getCode());
        System.out.println("Paciente: " + patient.getName() + " | ID: " + patient.getId() + " | Edad: " + patient.getAge() + " | Email: " + patient.getEmail() + " | Teléfono: " + patient.getPhone());
        System.out.println("Dentista: " + dentist.getName() + " | Especialidad: " + dentist.getSpecialty() + " | Licencia: " + dentist.getLicenseNumber());
        System.out.println("Duración: " + getDuration() + " min");
        System.out.println("Costo: $" + getCost());
        System.out.println("=======================================");
    }

    // Getters y Setters
    public Patient9 getPatient() {
        return patient;
    }

    public void setPatient(Patient9 patient) {
        this.patient = patient;
    }

    public Dentist9 getDentist() {
        return dentist;
    }

    public void setDentist(Dentist9 dentist) {
        this.dentist = dentist;
    }
}


