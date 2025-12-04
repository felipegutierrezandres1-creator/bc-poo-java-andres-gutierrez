public class Appointment {

    private Patient4 patient;
    private String date;
    private String time;
    private Assistant assistant;
    private String reason;

    public Appointment(Patient4 patient, String date, String time, Assistant assistant, String reason) {
        this.patient = patient;
        this.date = date;
        this.time = time;
        this.assistant = assistant;
        this.reason = reason;
    }

    public Patient4 getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public String getReason() {
        return reason;
    }

    public void showAppointmentInfo() {
        System.out.println("Patient: " + patient.getFullName());
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Reason: " + reason);

        if (assistant != null) {
            System.out.println("Assistant: " + assistant.getFullName());
        } else {
            System.out.println("Assistant: None");
        }
    }
}