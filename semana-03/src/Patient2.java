public class Patient2 {
    private String fullName;
    private String documentId;
    private String phone;
    private String email;

    // Constructor completo
    public Patient2(String fullName, String documentId, String phone, String email) {
        setFullName(fullName);
        setDocumentId(documentId);
        setPhone(phone);
        setEmail(email);
    }

    // Constructor básico
    public Patient2(String fullName, String documentId) {
        this(fullName, documentId, "No phone", "no-email@example.com");
    }

    // Constructor mínimo
    public Patient2(String fullName) {
        this(fullName, "0000000000");
    }

    // Getters
    public String getFullName() { return fullName; }
    public String getDocumentId() { return documentId; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    // Setters con validaciones
    public void setFullName(String fullName) {
        if (isEmpty(fullName)) {
            throw new IllegalArgumentException("Full name cannot be empty");
        }
        this.fullName = fullName;
    }

    public void setDocumentId(String documentId) {
        if (isEmpty(documentId)) {
            throw new IllegalArgumentException("Document ID cannot be empty");
        }
        this.documentId = documentId;
    }

    public void setPhone(String phone) {
        if (isEmpty(phone)) {
            throw new IllegalArgumentException("Phone cannot be empty");
        }
        this.phone = phone;
    }

    public void setEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }

    // Auxiliares privados
    private boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
