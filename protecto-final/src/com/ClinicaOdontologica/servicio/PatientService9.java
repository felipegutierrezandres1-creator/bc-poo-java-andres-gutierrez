package com.ClinicaOdontologica.servicio;

import com.ClinicaOdontologica.modelo.Patient9;
import com.ClinicaOdontologica.excepciones.DuplicateEntityException;
import java.util.ArrayList;
import java.util.List;

public class PatientService9 {

    private List<Patient9> patients;

    public PatientService9() {
        this.patients = new ArrayList<>();
    }

    // Agregar paciente
    public void addPatient(Patient9 patient) throws DuplicateEntityException {
        for (Patient9 p : patients) {
            if (p.getId().equalsIgnoreCase(patient.getId())) {
                throw new DuplicateEntityException("El paciente con este ID ya existe.");
            }
        }
        patients.add(patient);
    }

    // Buscar paciente por ID
    public Patient9 findPatientById(String id) {
        for (Patient9 p : patients) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    // Listar todos los pacientes
    public List<Patient9> getAllPatients() {
        return patients;
    }
}
