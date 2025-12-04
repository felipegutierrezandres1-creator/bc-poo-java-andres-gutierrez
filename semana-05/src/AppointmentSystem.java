import java.util.ArrayList;

public class AppointmentSystem {

    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void createAppointment(Patient4 patient, String date, String time, Assistant assistant, String reason) {
        appointments.add(new Appointment(patient, date, time, assistant, reason));
    }

    public void showPersonRole(Person2 person) {
        System.out.println("=== Checking person type ===");

        if (person instanceof Patient4) {
            System.out.println(person.getFullName() + " is a PATIENT.");
        } else if (person instanceof Assistant) {
            System.out.println(person.getFullName() + " is an ASSISTANT.");
        } else if (person instanceof Dentist4) {
            System.out.println(person.getFullName() + " is a DENTIST.");
        } else {
            System.out.println(person.getFullName() + " is a generic PERSON.");
        }
    }

    //         SOBRECARGA DE MÉTODOS
    public void showAppointments() {
        System.out.println("===== ALL APPOINTMENTS =====");
        for (Appointment a : appointments) {
            a.showAppointmentInfo();
            System.out.println("--------------------");
        }
    }

    public void showAppointments(String date) {
        System.out.println("===== APPOINTMENTS ON " + date + " =====");
        for (Appointment a : appointments) {
            if (a.getDate().equals(date)) {
                a.showAppointmentInfo();
                System.out.println("--------------------");
            }
        }
    }

    public void showAppointments(Patient4 patient) {
        System.out.println("===== APPOINTMENTS FOR PATIENT " + patient.getFullName() + " =====");
        for (Appointment a : appointments) {
            if (a.getPatient().equals(patient)) {
                a.showAppointmentInfo();
                System.out.println("--------------------");
            }
        }
    }

    public void showAppointments(Assistant assistant) {
        System.out.println("===== APPOINTMENTS WITH ASSISTANT " + assistant.getFullName() + " =====");
        for (Appointment a : appointments) {
            if (a.getAssistant() != null && a.getAssistant().equals(assistant)) {
                a.showAppointmentInfo();
                System.out.println("--------------------");
            }
        }
    }

    public int countAppointments() {
        return appointments.size();
    }
}

