public class DentalAppointment {
    private String appointmentId;
    private Patient patient;
    private Dentist dentist;
    private DentalTreatment treatment;
    private String date;
    private String time;

    public DentalAppointment(String appointmentId, Patient patient, Dentist dentist,
                             DentalTreatment treatment, String date, String time) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.dentist = dentist;
        this.treatment = treatment;
        this.date = date;
        this.time = time;
    }

    public void showDetails() {
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient: " + patient.getFullName());
        System.out.println("Dentist: " + dentist.getName());
        System.out.println("Treatment: " + treatment.getName());
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("-----------------------------");
    }

    public String getAppointmentId() { return appointmentId; }
    public void setAppointmentId(String appointmentId) { this.appointmentId = appointmentId; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public Dentist getDentist() { return dentist; }
    public void setDentist(Dentist dentist) { this.dentist = dentist; }

    public DentalTreatment getTreatment() { return treatment; }
    public void setTreatment(DentalTreatment treatment) { this.treatment = treatment; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
}

