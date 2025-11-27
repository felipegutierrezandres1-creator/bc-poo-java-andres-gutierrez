public class DentalAppointment2 {
    private String appointmentId;
    private Patient2 patient;
    private Dentist2 dentist;
    private DentalTreatment2 treatment;
    private String date;
    private String time;

    // Constructor completo
    public DentalAppointment2(String appointmentId, Patient2 patient, Dentist2 dentist,
                              DentalTreatment2 treatment, String date, String time) {
        setAppointmentId(appointmentId);
        setPatient(patient);
        setDentist(dentist);
        setTreatment(treatment);
        setDate(date);
        setTime(time);
    }

    // Constructor básico
    public DentalAppointment2(String appointmentId, Patient2 patient, Dentist2 dentist) {
        this(appointmentId, patient, dentist, new DentalTreatment2("General Check"), "N/A", "N/A");
    }

    // Constructor mínimo
    public DentalAppointment2(String appointmentId) {
        this(appointmentId, new Patient2("Unknown"), new Dentist2("Unknown"));
    }

    // Getters
    public String getAppointmentId() { return appointmentId; }
    public Patient2 getPatient() { return patient; }
    public Dentist2 getDentist() { return dentist; }
    public DentalTreatment2 getTreatment() { return treatment; }
    public String getDate() { return date; }
    public String getTime() { return time; }

    // Setters
    public void setAppointmentId(String appointmentId) {
        if (isEmpty(appointmentId)) {
            throw new IllegalArgumentException("Appointment ID cannot be empty");
        }
        this.appointmentId = appointmentId;
    }

    public void setPatient(Patient2 patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null");
        }
        this.patient = patient;
    }

    public void setDentist(Dentist2 dentist) {
        if (dentist == null) {
            throw new IllegalArgumentException("Dentist cannot be null");
        }
        this.dentist = dentist;
    }

    public void setTreatment(DentalTreatment2 treatment) {
        if (treatment == null) {
            throw new IllegalArgumentException("Treatment cannot be null");
        }
        this.treatment = treatment;
    }

    public void setDate(String date) {
        if (isEmpty(date)) {
            throw new IllegalArgumentException("Date cannot be empty");
        }
        this.date = date;
    }

    public void setTime(String time) {
        if (isEmpty(time)) {
            throw new IllegalArgumentException("Time cannot be empty");
        }
        this.time = time;
    }

    private boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "Appointment " + appointmentId + " | Patient: " + patient + " | Dentist: " + dentist +
                " | Treatment: " + treatment.getName() + " | Date: " + date + " | Time: " + time;
    }
}