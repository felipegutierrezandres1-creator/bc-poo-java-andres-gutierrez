
import java.util.ArrayList;

public class Clinic {
    private String name;
    private ArrayList<DentalAppointment> appointments;

    public Clinic(String name) {
        this.name = name;
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(DentalAppointment appointment) {
        appointments.add(appointment);
    }

    public void showAppointments() {
        for (DentalAppointment a : appointments) {
            a.showDetails();
        }
    }
    public int countAppointments() {
        return appointments.size();
    }
}
