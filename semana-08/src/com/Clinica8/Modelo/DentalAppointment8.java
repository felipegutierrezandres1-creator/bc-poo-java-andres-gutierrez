package com.Clinica8.Modelo;
import com.Clinica8.Util.*;

public class DentalAppointment8 implements Identifiable, Printable {
    private String appointmentId;
    private Patient8 patient;
    private Dentist8 dentist;
    private DentalTreatment8 treatment;
    private String date;
    private String time;

    public DentalAppointment8(String appointmentId, Patient8 patient, Dentist8 dentist, DentalTreatment8 treatment, String date, String time) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.dentist = dentist;
        this.treatment = treatment;
        this.date = date;
        this.time = time;
    }

    public DentalAppointment8() {
        this("Sin ID", new Patient8("Sin paciente"), new Dentist8("Sin dentista"), new DentalTreatment8("Sin tratamiento"), "Sin fecha", "Sin hora");
    }

    public String getAppointmentId() { return appointmentId; }
    public void setAppointmentId(String appointmentId) { this.appointmentId = appointmentId; }

    public Patient8 getPatient() { return patient; }
    public void setPatient(Patient8 patient) { this.patient = patient; }

    public Dentist8 getDentist() { return dentist; }
    public void setDentist(Dentist8 dentist) { this.dentist = dentist; }

    public DentalTreatment8 getTreatment() { return treatment; }
    public void setTreatment(DentalTreatment8 treatment) { this.treatment = treatment; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    @Override
    public String getId() {
        return appointmentId;
    }

    @Override
    public void printInfo() {
        System.out.println("Cita ID: " + appointmentId);
        patient.printInfo();
        dentist.printInfo();
        treatment.printInfo();
        System.out.println("Fecha: " + date + " | Hora: " + time);
        System.out.println("-----------------------------");
    }
}

