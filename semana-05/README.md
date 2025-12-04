# Semana 05 - Polimorfismo, Sobrecarga y Clases Gestoras

## 📝 Descripción

Durante esta semana se profundizó en uno de los pilares centrales de la Programación Orientada a Objetos: **el polimorfismo**.  
Se estudiaron los dos tipos presentes en Java:

---

### 🔹 Polimorfismo en tiempo de compilación (Sobrecarga / Overloading)

Permite definir varios métodos con el mismo nombre pero con diferentes parámetros.

En el proyecto se aplicó en la clase **AppointmentSystem**, específicamente para mostrar citas según:

- Fecha
- Paciente
- Asistente

---

### 🔹 Polimorfismo en tiempo de ejecución (Sobrescritura / Overriding)

Permite que una clase hija redefina un método heredado.

En el proyecto se aplicó cuando las clases:

- `Patient4`
- `Assistant`
- `Dentist4`

sobrescriben `showPersonInfo()` para mostrar información especializada según el tipo de persona.

---

Además, se introdujo el concepto de **clase gestora**, una clase encargada de administrar entidades.

En este caso, se implementó la clase **AppointmentSystem**, la cual:

- Registra citas.
- Maneja un **ArrayList polimórfico**.
- Gestiona asistentes, pacientes y dentistas.
- Permite aplicar **sobrecarga** y **polimorfismo dinámico** en sus métodos.

Finalmente, se creó un programa de demostración (`Main5.java`) que instancia pacientes, asistentes, dentistas y varias citas, mostrando cómo el sistema usa polimorfismo en tiempo de ejecución.

---

## 🎯 Objetivos Cumplidos

- ✔️ Definir qué es el polimorfismo
- ✔️ Identificar los tipos de polimorfismo en Java
- ✔️ Comprender las ventajas del polimorfismo
- ✔️ Reconocer situaciones donde aplicar polimorfismo

---

## 📂 Archivos Entregados

- **src/Person2.java** — Clase padre con atributos comunes.
- **src/Patient4.java** — Clase hija que sobrescribe métodos y añade información médica.
- **src/Assistant.java** — Clase hija que representa un asistente clínico.
- **src/Dentist4.java** — Clase hija para la información del odontólogo.
- **src/Appointment.java** — Representa una cita, con datos del paciente, asistente y motivo.
- **src/AppointmentSystem.java** — Clase gestora del sistema de citas (sobrecarga + polimorfismo).
- **src/Main5.java** — Programa de demostración.

---

## 🚀 Instrucciones de Ejecución
```
cd src
javac *.java
java Main5
```
## 📌 Ejemplo de Salida Esperada
```
===== ALL APPOINTMENTS =====
Patient: Carlos López
Date: 2025-01-10
Time: 10:00
Reason: Limpieza dental
Assistant: Ana Torres
--------------------

Patient: Carlos López
Date: 2025-01-10
Time: 15:30
Reason: Revisión general
Assistant: Ana Torres
--------------------

Patient: Daniela Ruiz
Date: 2025-01-11
Time: 09:00
Reason: Brackets
Assistant: Ana Torres
--------------------

===== APPOINTMENTS ON 2025-01-10 =====
... (citas filtradas por fecha)

===== APPOINTMENTS FOR PATIENT Carlos López =====
... (citas filtradas por paciente)

===== APPOINTMENTS WITH ASSISTANT Ana Torres =====
... (citas filtradas por asistente)

=== Checking person type ===
Carlos López is a PATIENT.
Ana Torres is an ASSISTANT.
Dr. Morales is a DENTIST.
```