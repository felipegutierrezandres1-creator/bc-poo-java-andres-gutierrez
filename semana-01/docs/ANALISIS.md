# Análisis del Dominio: Clínica Odontológica "Sonrisas Saludables"

## 1. Identificación de Objetos

### Objeto Principal: Cita Odontológica
- **Justificación:**  
  Es el elemento central de la clínica, ya que representa el momento en que un paciente recibe atención. Todas las demás acciones (pagos, historia clínica, asignación de odontólogo) dependen de una cita programada.
- **Atributos identificados:**
    - numeroCita
    - paciente
    - odontologo
    - tipoServicio
    - fecha
    - hora
- **Comportamientos:**
    - agendarCita()
    - cancelarCita()
    - confirmarCita()
    - mostrarDetalles()

### Objeto Secundario: Paciente
- **Justificación:**  
  Es quien solicita y recibe los servicios de la clínica. Sin pacientes no existirían citas ni tratamientos.
- **Relación con objeto principal:**  
  Cada cita odontológica pertenece a un paciente específico; un paciente puede tener múltiples citas a lo largo del tiempo.
- **Atributos identificados:**
    - nombreCompleto
    - documento
    - telefono
    - correo
- **Comportamientos:**
    - registrarPaciente()
    - actualizarDatos()
    - consultarHistorial()

### Objeto Secundario: Odontólogo
- **Justificación:**  
  Es el profesional encargado de realizar los procedimientos y brindar atención a los pacientes.
- **Relación con objeto principal:**  
  Cada cita se asocia a un odontólogo; un odontólogo puede atender varias citas en un mismo día.
- **Atributos identificados:**
    - nombre
    - especialidad
    - idProfesional
- **Comportamientos:**
    - atenderCita()
    - registrarDiagnostico()

---

---

## 2. Decisiones de Diseño

- **¿Por qué elegí estos atributos?**  
  Porque reflejan los datos mínimos que se gestionan en una clínica odontológica real: identificar a los pacientes, a los profesionales y la cita programada.

- **¿Qué validaciones implementé?**  
  Verificar que la fecha y hora no estén vacías, que el paciente tenga sus datos completos y que el número de cita sea único.

- **¿Qué relaciones identifiqué?**  
  Relación uno a muchos entre paciente y cita, y entre odontólogo y cita.

---

## 3. Dificultades Encontradas

- Entender cómo traducir elementos del mundo real (como una cita o un paciente) a clases y atributos en Java.
- Aprender la diferencia entre los métodos que pertenecen a una clase y los que representan acciones de un objeto.
- Recordar la sintaxis básica del constructor y el uso de `this`.
