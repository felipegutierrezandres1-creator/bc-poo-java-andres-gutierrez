package com.ClinicaOdontologica.servicio;

import com.ClinicaOdontologica.modelo.abstractas.*;
import com.ClinicaOdontologica.modelo.CleaningAppointment9;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona las operaciones CRUD para citas dentales.
 */
public class AppointmentService9 {

    private List<DentalProcedure9> appointments;

    public AppointmentService9() {
        this.appointments = new ArrayList<>();
    }

    // Agregar una cita
    public void addAppointment(DentalProcedure9 appointment) {
        appointments.add(appointment);
    }

    // Listar todas las citas
    public List<DentalProcedure9> getAllAppointments() {
        return appointments;
    }

    // Buscar cita por código
    public DentalProcedure9 findAppointmentByCode(String code) {
        for (DentalProcedure9 appt : appointments) {
            if (appt.getCode().equalsIgnoreCase(code)) {
                return appt;
            }
        }
        return null;
    }
}

