package com.ClinicaOdontologica.modelo;
import com.ClinicaOdontologica.modelo.abstractas.*;

public class ExtractionAppointment9 extends DentalProcedure9 {
    private String patientId;
    private String dentistId;

    public ExtractionAppointment9(String code, String name, int duration, double cost,
                                  String patientId, String dentistId) {
        super(code, name, duration, cost);
        this.patientId = patientId;
        this.dentistId = dentistId;
    }

    @Override
    public void perform() {
        System.out.println("Cita de extracción dental realizada para el paciente: " + patientId);
    }

    @Override
    public void showDetails() {
        System.out.println("Código: " + getCode() +
                ", Paciente: " + patientId +
                ", Dentista: " + dentistId +
                ", Duración: " + getDuration() + " min" +
                ", Costo: $" + getCost());
    }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getDentistId() { return dentistId; }
    public void setDentistId(String dentistId) { this.dentistId = dentistId; }
}