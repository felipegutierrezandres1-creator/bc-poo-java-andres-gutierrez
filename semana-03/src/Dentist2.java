public class Dentist2 {
    private String name;
    private String specialty;
    private String professionalLicense;

    // Constructor completo
    public Dentist2(String name, String specialty, String professionalLicense) {
        setName(name);
        setSpecialty(specialty);
        setProfessionalLicense(professionalLicense);
    }

    // Constructor básico
    public Dentist2(String name, String specialty) {
        this(name, specialty, "NO-LICENSE");
    }

    // Constructor mínimo
    public Dentist2(String name) {
        this(name, "General Dentistry", "NO-LICENSE");
    }

    // Getters
    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
    public String getProfessionalLicense() { return professionalLicense; }

    // Setters con validación
    public void setName(String name) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setSpecialty(String specialty) {
        if (isEmpty(specialty)) {
            throw new IllegalArgumentException("Specialty cannot be empty");
        }
        this.specialty = specialty;
    }

    public void setProfessionalLicense(String professionalLicense) {
        if (isEmpty(professionalLicense)) {
            throw new IllegalArgumentException("License cannot be empty");
        }
        this.professionalLicense = professionalLicense;
    }

    private boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    @Override
    public String toString() {
        return name + " - " + specialty + " (License: " + professionalLicense + ")";
    }
}

