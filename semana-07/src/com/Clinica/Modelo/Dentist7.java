package com.Clinica.Modelo;

public class Dentist7 extends PersonBase7 implements Identifiable, Printable, Saveable, Schedulable {

    private String specialization;
    private int yearsOfExperience;

    public Dentist7(String fullName, int idNumber, String phoneNumber, String email,
                    int age, String gender, String specialization, int yearsOfExperience) {

        super(fullName, idNumber, phoneNumber, email, age, gender);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void showRole() {
        System.out.println("Rol: Odontólogo del sistema");
    }

    @Override
    public String getId() {
        return "DENT-" + idNumber;
    }

    @Override
    public boolean schedule() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("=== ODONTÓLOGO ===");
        showBasicInfo();
        System.out.println("Especialización: " + specialization);
        System.out.println("Años de experiencia: " + yearsOfExperience);
    }

    @Override
    public void save() {
        System.out.println("Dentista " + fullName + " guardado correctamente en el sistema.");
    }

    @Override
    public boolean validateDate(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    @Override
    public boolean validateTime(String time) {
        return time.matches("\\d{2}:\\d{2}");
    }

    public String isBusy() {
        return "";
    }
}
