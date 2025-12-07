package com.Clinica.Modelo;

import com.Clinica.Excepciones.*;

public class Assistant7 extends PersonBase7 implements Identifiable, Printable, Saveable, Schedulable {

    private String assignedArea;
    private String supervisorName;

    public Assistant7(String fullName, int idNumber, String phoneNumber, String email,
                      int age, String gender, String assignedArea, String supervisorName) {

        super(fullName, idNumber, phoneNumber, email, age, gender);
        this.assignedArea = assignedArea;
        this.supervisorName = supervisorName;
    }

    @Override
    public void showRole() {
        System.out.println("Rol: Asistente clínico");
    }

    @Override
    public String getId() {
        return "ASST-" + idNumber;
    }

    @Override
    public boolean schedule() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("=== ASISTENTE ===");
        showBasicInfo();
        System.out.println("Área asignada: " + assignedArea);
        System.out.println("Supervisor: " + supervisorName);
    }

    @Override
    public void save() {
        System.out.println("Asistente " + fullName + " guardado correctamente en el sistema.");
    }

    @Override
    public boolean validateDate(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    @Override
    public boolean validateTime(String time) {
        return time.matches("\\d{2}:\\d{2}");
    }
}
