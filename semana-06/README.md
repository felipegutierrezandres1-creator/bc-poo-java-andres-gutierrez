# 🏥 Sistema de Gestión Odontologia – Proyecto Java (POO)

Este proyecto es una implementación en Java que demuestra el uso de **clases abstractas**, **interfaces**, **herencia**, **polimorfismo** y **composición** dentro de un sistema de gestión médica sencillo.  
Incluye entidades como pacientes, dentistas y citas médicas.

---

## 📂 Estructura del Proyecto
```css
src/
├── Abstractas/
│    ├── PersonBase.java
│    └── MedicalRecordBase.java
│
├── Interfaces/
│    ├── Schedulable.java
│    ├── Identifiable.java
│    ├── Saveable.java
│    └── Printable.java
│
├── Clases/
│    ├── Patient6.java
│    ├── Dentist6.java
│    ├── Assistant6.java
│    ├── MedicalRecord6.java
│    └── Appointment6.java
│
└── Main/
└── Main.java
```


---

## 🧩 Descripción de los Componentes

### 🔹 1. Clases Abstractas

#### `PersonBase`
Define atributos genéricos de una persona:
- Nombre completo
- Documento
- Teléfono
- Correo
- Edad
- Género

Contiene métodos para mostrar información básica y un método abstracto `showRole()`.

#### `MedicalRecordBase`
Representa un historial clínico básico con:
- ID del registro
- Nombre del paciente
- Fecha de creación
- Notas

Incluye un método abstracto `showDetailedInfo()`.

---

### 🔹 2. Interfaces

| Interface | Función |
|----------|---------|
| `Schedulable` | Permite agendar eventos (citas) |
| `Identifiable` | Genera identificadores únicos |
| `Printable` | Enviar notificaciones o imprimir información relevante |

---

### 🔹 3. Clases Concretas

#### `Patient6`
Extiende **PersonBase** e implementa:
- `Schedulable`
- `Identifiable`
- `Printable`

Incluye:
- Condición médica
- Método para mostrar información del paciente
- Registro de citas

#### `Dentist`
Extiende **PersonBase** e implementa:
- `Identifiable`
- `Printable`

Incluye:
- Especialidad (ej: odontología general, ortodoncia, etc.)

#### `Appointment`
Representa una cita entre médico y paciente:
- Fecha
- Hora
- Paciente
- Dentista

Incluye método `printSummary()` para mostrar un resumen completo de la cita.

---

## ▶️ Ejecución del Programa

El método **Main** crea un paciente, un dentista y una cita, y simula:

- Generación de IDs
- Notificaciones
- Programación de la cita
- Impresión del resumen final

Para ejecutarlo:

```bash
javac Main.java
java Main
```

## Salida esperada

```bash
"C:\Program Files\Eclipse Adoptium\jdk-21.0.9.10-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.2.4\lib\idea_rt.jar=55839" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\felip\OneDrive\Escritorio\bc-poo-java-andres-gutierrez\out Main6

=== VALIDANDO FECHAS ===
Fecha válida c1: true
Hora válida c1: true

=== GUARDANDO CITAS ===
Cita 001 guardada en el sistema.
Cita 002 guardada en el sistema.

=== MOSTRAR CITA COMPLETA ===
=========== CITA ODONTOLÓGICA ===========
ID de cita: APPT-001
Motivo: Limpieza Dental
Fecha: 2025-01-10
Hora: 10:00
----- Información del paciente -----
Nombre completo: María Pérez
Documento: 1001
Teléfono: 3105551234
Correo: maria@gmail.com
Edad: 28
Género: Femenino
----- Odontólogo asignado -----
Nombre completo: Dr. Ramírez
Documento: 2001
Teléfono: 3125559988
Correo: ramirez@clinic.com
Edad: 45
Género: Masculino
----- Asistente clínico -----
Nombre completo: Laura Sánchez
Documento: 3001
Teléfono: 3201122334
Correo: laura@clinic.com
Edad: 26
Género: Femenino
==========================================

=== MOSTRAR OTRA CITA COMPLETA ===
=========== CITA ODONTOLÓGICA ===========
ID de cita: APPT-002
Motivo: Revisión general
Fecha: 2025-01-14
Hora: 15:30
----- Información del paciente -----
Nombre completo: Carlos Gómez
Documento: 1002
Teléfono: 3158884422
Correo: carlos@gmail.com
Edad: 32
Género: Masculino
----- Odontólogo asignado -----
Nombre completo: Dr. Ramírez
Documento: 2001
Teléfono: 3125559988
Correo: ramirez@clinic.com
Edad: 45
Género: Masculino
----- Asistente clínico -----
Nombre completo: Laura Sánchez
Documento: 3001
Teléfono: 3201122334
Correo: laura@clinic.com
Edad: 26
Género: Femenino
==========================================

=== MOSTRAR SOLO INFORMACIÓN BÁSICA ===
Nombre completo: María Pérez
Documento: 1001
Teléfono: 3105551234
Correo: maria@gmail.com
Edad: 28
Género: Femenino
Nombre completo: Dr. Ramírez
Documento: 2001
Teléfono: 3125559988
Correo: ramirez@clinic.com
Edad: 45
Género: Masculino
Nombre completo: Laura Sánchez
Documento: 3001
Teléfono: 3201122334
Correo: laura@clinic.com
Edad: 26
Género: Femenino

=== RESÚMENES ===
Cita #001 - María Pérez con Dr. Ramírez
Cita #002 - Carlos Gómez con Dr. Ramírez

FIN DEL PROGRAMA 😎

Process finished with exit code 0

```
