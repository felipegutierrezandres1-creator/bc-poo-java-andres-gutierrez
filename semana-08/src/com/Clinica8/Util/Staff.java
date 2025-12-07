package com.Clinica8.Util;

public abstract class Staff extends Person8 {
    protected String professionalLicense;

    public Staff(String fullName, String documentId, String professionalLicense) {
        super(fullName, documentId);
        this.professionalLicense = professionalLicense;
    }

    public String getProfessionalLicense() { return professionalLicense; }
    public void setProfessionalLicense(String professionalLicense) { this.professionalLicense = professionalLicense; }

    public abstract String getName();

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Licencia profesional: " + professionalLicense);
    }
}
