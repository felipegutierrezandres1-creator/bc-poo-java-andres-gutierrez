
public class Dentist {
    private String name;
    private String specialty;
    private String professionalLicense;

    public Dentist(String name, String specialty, String professionalLicense) {
        this.name = name;
        this.specialty = specialty;
        this.professionalLicense = professionalLicense;
    }

    public String getInfo() {
        return name + " - " + specialty + " (License: " + professionalLicense + ")";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public String getProfessionalLicense() {
        return professionalLicense;
    }
    public void setProfessionalLicense(String professionalLicense) {
        this.professionalLicense = professionalLicense;
    }
}
