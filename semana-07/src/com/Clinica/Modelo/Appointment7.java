package com.Clinica.Modelo;

public class Appointment7 implements Identifiable, Printable, Saveable, Schedulable {

    private String appointmentId;
    private Patient7 patient;
    private Dentist7 dentist;
    private Assistant7 assistant;
    private String date;
    private String time;
    private String reason;

    public Appointment7(String appointmentId, Patient7 patient, Dentist7 dentist,
                        Assistant7 assistant, String date, String time, String reason) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.dentist = dentist;
        this.assistant = assistant;
        this.date = date;
        this.time = time;
        this.reason = reason;
    }

    @Override
    public String getId() {
        return "APPT-" + appointmentId;
    }

    @Override
    public void print() {
        System.out.println("=========== CITA ODONTOLÓGICA ===========");
        System.out.println("ID de cita: " + getId());
        System.out.println("Motivo: " + reason);
        System.out.println("Fecha: " + date);
        System.out.println("Hora: " + time);
        System.out.println("----- Información del paciente -----");
        patient.showBasicInfo();
        System.out.println("----- Odontólogo asignado -----");
        dentist.showBasicInfo();
        System.out.println("----- Asistente clínico -----");
        assistant.showBasicInfo();
        System.out.println("==========================================");
    }

    @Override
    public void save() {
        System.out.println("Cita " + appointmentId + " guardada en el sistema.");
    }

    @Override
    public boolean validateDate(String date) {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    @Override
    public boolean validateTime(String time) {
        return time.matches("\\d{2}:\\d{2}");
    }

    // Metodos extra útiles
    public void showSummary() {
        System.out.println("Cita #" + appointmentId + " - " + patient.getFullName() + " con " + dentist.getFullName());
    }

    public Patient7 getPatient() { return patient; }
    public Dentist7 getDentist() { return dentist; }
    public Assistant7 getAssistant() { return assistant; }

    public String getTime() {
    return""; }

    public Object getDate() {return "";}

    @Override
    public boolean schedule() {
        System.out.println("Appointment scheduled: " + getId());
        return true;
    }

}
