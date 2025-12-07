package com.Clinica.Modelo;

public class MedicalRecord7 extends MedicalRecordBase7 implements Identifiable, Printable, Saveable {

    private String treatmentPlan;
    private String allergies;

    public MedicalRecord7(String recordId, String patientName, String creationDate,
                          String notes, String treatmentPlan, String allergies) {

        super(recordId, patientName, creationDate, notes);
        this.treatmentPlan = treatmentPlan;
        this.allergies = allergies;
    }

    @Override
    public void showDetailedInfo() {
        System.out.println("=== HISTORIA CLÍNICA DETALLADA ===");
        showBasicRecordInfo();
        System.out.println("Plan de tratamiento: " + treatmentPlan);
        System.out.println("Alergias: " + allergies);
    }

    @Override
    public String getId() {
        return "MR-" + recordId;
    }

    @Override
    public boolean schedule() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("=== HISTORIA CLÍNICA ===");
        showDetailedInfo();
    }

    @Override
    public void save() {
        System.out.println("Historia clínica " + recordId + " guardada correctamente.");
    }
}
