package Implementaciones;

import Interfaces.Identifiable;
import Interfaces.Printable;
import Interfaces.Saveable;
import Interfaces.Schedulable;

public class Appointment6 implements Identifiable, Printable, Saveable, Schedulable {

    private String appointmentId;
    private Patient6 patient;
    private Dentist6 dentist;
    private Assistant6 assistant;
    private String date;
    private String time;
    private String reason;

    public Appointment6(String appointmentId, Patient6 patient, Dentist6 dentist,
                        Assistant6 assistant, String date, String time, String reason) {
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

    public Patient6 getPatient() { return patient; }
    public Dentist6 getDentist() { return dentist; }
    public Assistant6 getAssistant() { return assistant; }
}
