package Abstractas;

public abstract class MedicalRecordBase {

    protected String recordId;      // Código único del registro
    protected String patientName;   // Nombre del paciente
    protected String creationDate;  // Fecha de creación del registro
    protected String notes;         // Notas generales del registro

    public MedicalRecordBase(String recordId, String patientName, String creationDate, String notes) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.creationDate = creationDate;
        this.notes = notes;
    }

    public void showBasicRecordInfo() {
        System.out.println("ID Registro: " + recordId);
        System.out.println("Paciente: " + patientName);
        System.out.println("Fecha de creación: " + creationDate);
        System.out.println("Notas: " + notes);
    }

    public abstract void showDetailedInfo();
}

