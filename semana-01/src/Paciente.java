public class Paciente {
    // Atributos
    String nombreCompleto;
    String documento;
    String telefono;
    String correo;

    // Constructor
    public Paciente(String nombreCompleto, String documento, String telefono, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Paciente: " + nombreCompleto);
        System.out.println("Documento: " + documento);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("----------------------");
    }
}





