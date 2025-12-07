package com.Clinica8.Servicio;

import com.Clinica8.Modelo.DentalAppointment8;
import com.Clinica8.Modelo.Patient8;
import com.Clinica8.Modelo.Dentist8;
import com.Clinica8.Excepciones.AppointmentAlreadyExistsException;
import com.Clinica8.Excepciones.AppointmentNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clinic8 {

    private List<DentalAppointment8> appointments;
    private Map<String, DentalAppointment8> appointmentsById;

    public Clinic8() {
        appointments = new ArrayList<>();
        appointmentsById = new HashMap<>();
    }

    // Agregar cita
    public void addAppointment(DentalAppointment8 a) throws AppointmentAlreadyExistsException {
        if (appointmentsById.containsKey(a.getAppointmentId())) {
            throw new AppointmentAlreadyExistsException(a.getAppointmentId());
        }
        appointments.add(a);
        appointmentsById.put(a.getAppointmentId(), a);
    }

    // Buscar cita por ID
    public DentalAppointment8 findById(String id) throws AppointmentNotFoundException {
        if (!appointmentsById.containsKey(id)) {
            throw new AppointmentNotFoundException(id);
        }
        return appointmentsById.get(id);
    }

    // Eliminar cita por ID
    public void removeAppointment(String id) throws AppointmentNotFoundException {
        DentalAppointment8 a = findById(id);
        appointments.remove(a);
        appointmentsById.remove(id);
    }

    // Filtrar por dentista
    public List<DentalAppointment8> filterByDentist(String dentistName) {
        List<DentalAppointment8> result = new ArrayList<>();
        for (DentalAppointment8 a : appointments) {
            if (a.getDentist().getName().equalsIgnoreCase(dentistName)) {
                result.add(a);
            }
        }
        return result;
    }

    // Filtrar por paciente
    public List<DentalAppointment8> filterByPatient(String patientName) {
        List<DentalAppointment8> result = new ArrayList<>();
        for (DentalAppointment8 a : appointments) {
            if (a.getPatient().getFullName().equalsIgnoreCase(patientName)) {
                result.add(a);
            }
        }
        return result;
    }

    // Estadísticas
    public int totalAppointments() {
        return appointments.size();
    }

    public Map<String, Integer> countByTreatment() {
        Map<String, Integer> count = new HashMap<>();
        for (DentalAppointment8 a : appointments) {
            String treatment = a.getTreatment().getName();
            count.put(treatment, count.getOrDefault(treatment, 0) + 1);
        }
        return count;
    }

    // Obtener todas las citas
    public List<DentalAppointment8> getAllAppointments() {
        return new ArrayList<>(appointments);
    }
}
