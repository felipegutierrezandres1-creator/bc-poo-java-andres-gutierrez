
public class Patient {
    private String fullName;
    private String documentId;
    private String phone;
    private String email;

    public Patient(String fullName, String documentId, String phone, String email) {
        this.fullName = fullName;
        this.documentId = documentId;
        this.phone = phone;
        this.email = email;
    }

    public void showInfo() {
        System.out.println("Patient: " + fullName);
        System.out.println("Document ID: " + documentId);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("----------------------------");
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getDocumentId() { return documentId; }
    public void setDocumentId(String documentId) { this.documentId = documentId; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
