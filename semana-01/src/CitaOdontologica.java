public class CitaOdontologica {
    // Atributos
    String numeroCita;
    String paciente;
    String odontologo;
    String tipoServicio;
    String fecha;
    String hora;

    // Constructor
    public CitaOdontologica(String numeroCita, String paciente, String odontologo, String tipoServicio, String fecha, String hora) {
        this.numeroCita = numeroCita;
        this.paciente = paciente;
        this.odontologo = odontologo;
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Método para mostrar información
    public void mostrarDetalles() {
        System.out.println("Cita No.: " + numeroCita);
        System.out.println("Paciente: " + paciente);
        System.out.println("Odontólogo: " + odontologo);
        System.out.println("Servicio: " + tipoServicio);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("----------------------");
    }
}








