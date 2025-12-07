package com.Clinica.Modelo;

public class Patient7 extends PersonBase7 implements Schedulable, Identifiable, Printable {

    private String medicalCondition;

    public Patient7(String fullName, int idNumber, String phoneNumber,
                    String email, int age, String gender, String medicalCondition) {

        super(fullName, idNumber, phoneNumber, email, age, gender);
        this.medicalCondition = medicalCondition;
    }

    // Obligatorio por PersonBase
    @Override
    public void showRole() {
        System.out.println("Rol: Paciente del sistema odontológico");
    }

    // Obligatorio por Printable
    @Override
    public void print() {
        System.out.println("=== Paciente ===");
        showBasicInfo();
        System.out.println("Condición médica: " + medicalCondition);
    }

    // Obligatorio por Identifiable
    @Override
    public String getId() {
        return "PAT-" + idNumber;
    }

    @Override
    public boolean schedule() {
        return false;
    }

    // Obligatorio por Schedulable
    @Override
    public boolean validateDate(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    @Override
    public boolean validateTime(String time) {
        return time.matches("\\d{2}:\\d{2}");
    }
}
