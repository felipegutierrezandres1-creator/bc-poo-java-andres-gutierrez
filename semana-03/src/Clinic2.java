import java.util.ArrayList;

public class Clinic2 {
    private String name;
    private ArrayList<DentalAppointment2> appointments;

    // Constructor completo
    public Clinic2(String name) {
        setName(name);
        this.appointments = new ArrayList<>();
    }

    // Constructor mínimo
    public Clinic2() {
        this("Unnamed Clinic");
    }

    // Getters
    public String getName() { return name; }
    public int getAppointmentCount() { return appointments.size(); }
    public ArrayList<DentalAppointment2> getAppointments() { return appointments; }

    // Setter
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Clinic name cannot be empty");
        }
        this.name = name;
    }

    // Métodos
    public void addAppointment(DentalAppointment2 appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Cannot add null appointment");
        }
        appointments.add(appointment);
    }

    public DentalAppointment2 findById(String id) {
        for (DentalAppointment2 a : appointments) {
            if (a.getAppointmentId().equals(id)) {
                return a;
            }
        }
        return null;
    }
}
