package com.Clinica8.Util;

public abstract class Person8 implements Identifiable, Printable {
    protected String fullName;
    protected String documentId;

    public Person8(String fullName, String documentId) {
        this.fullName = fullName;
        this.documentId = documentId;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getDocumentId() { return documentId; }
    public void setDocumentId(String documentId) { this.documentId = documentId; }

    @Override
    public String getId() {
        return documentId;
    }

    @Override
    public void printInfo() {
        System.out.println("Nombre: " + fullName + " | Documento: " + documentId);
    }
}
