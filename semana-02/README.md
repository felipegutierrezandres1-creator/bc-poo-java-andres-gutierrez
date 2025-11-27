# Sistema de Gestión Odontológica – Semana 02

Este proyecto es una expansión del sistema realizado en la semana 01, agregando nuevas clases, relaciones entre objetos y el uso de colecciones como `ArrayList`.  
El programa simula la gestión básica de una clínica odontológica: pacientes, odontólogos, tratamientos y citas.

---

## 📌 Estructura del Proyecto

```bash
bc-oop-java-[ficha]-[apellido]/
└── semana-02/
├── README.md
├── Patient.java
├── Dentist.java
├── DentalTreatment.java
├── DentalAppointment.java
├── Clinic.java
└── Main.java
```


---

## 📌 Clases Implementadas

### **Patient.java**
Representa a un paciente del sistema.  
Cuenta con atributos básicos como nombre, documento, teléfono y correo, además de un método para mostrar su información.

### **Dentist.java**
Clase que modela a un odontólogo.  
Incluye nombre, especialidad y número de registro profesional.  
También cuenta con un método que devuelve un resumen del odontólogo.

### **DentalTreatment.java**
Representa un tratamiento dental.  
Incluye nombre del tratamiento, costo y duración en minutos.

### **DentalAppointment.java**
Define una cita odontológica, relacionando:
- un paciente
- un odontólogo
- un tratamiento dental

Además, muestra los detalles completos de la cita.

### **Clinic.java**
Clase gestora que usa `ArrayList` para administrar las citas registradas.  
Permite agregar citas, mostrarlas y contar cuántas hay.

---

## 📌 Relaciones Entre Objetos

El sistema implementa **composición y agregación**:

- **DentalAppointment** contiene:
    - un objeto `Patient`
    - un objeto `Dentist`
    - un objeto `DentalTreatment`

- **Clinic** gestiona múltiples `DentalAppointment` usando:
```bash
ArrayList<DentalAppointment>
```

---

## 📌 Ejecución del Programa

Para compilar:
```bash
javac *.java
```
Para ejecutar:
```bash
java Main
```

El programa mostrará toda la información de las citas registradas y el total de citas creadas.

---

## 📌 Resumen General

Este proyecto cumple con los requerimientos de la semana 02:

- ✔️ Nuevas clases creadas
- ✔️ Relaciones entre objetos
- ✔️ Uso de ArrayList
- ✔️ Main funcional mostrando resultados

Todo el sistema está traducido al inglés en el código, pero documentado en español para la entrega.

## Salida Esperada

```bash
C:\Users\felip\.jdks\temurin-21.0.9\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.2.4\lib\idea_rt.jar=52050" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\felip\OneDrive\Escritorio\bc-poo-java-andres-gutierrez\out\production Main2
Appointment ID: APPT-001
Patient: María Pérez
Dentist: Dr. Gómez
Treatment: Dental Cleaning
Date: 2025-10-31
Time: 08:00 AM
-----------------------------
Appointment ID: APPT-002
Patient: Carlos Gómez
Dentist: Dr. López
Treatment: Orthodontics
Date: 2025-11-01
Time: 09:30 AM
-----------------------------
Total registered appointments: 2

Process finished with exit code 0
```
