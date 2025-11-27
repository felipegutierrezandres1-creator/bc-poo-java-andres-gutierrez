# 🦷 Sistema de Gestión Odontológica
### Semana 03 – Encapsulación, Constructores y Validaciones

Este proyecto corresponde al desarrollo del sistema de gestión odontológica para la **Semana 03** del curso de Programación Orientada a Objetos (POO) en Java.  
En esta entrega se aplican los conceptos fundamentales de:

- Encapsulación completa
- Setters con validaciones
- Métodos privados auxiliares
- Sobrecarga de constructores
- Manejo seguro de objetos
- Reestructuración del main para pruebas más completas

El sistema simula la gestión de pacientes, dentistas, tratamientos y citas en una clínica odontológica.

---

# 📘 Objetivo de la Semana 03

El propósito de esta semana es mejorar la arquitectura del sistema implementado anteriormente (Semana 02), garantizando:

- **Mayor robustez**
- **Control sobre los datos internos**
- **Objetos más seguros y coherentes**
- **Flexibilidad a la hora de instanciar clases**
- **Buenas prácticas de programación orientada a objetos**

---

# 📂 Estructura del Proyecto

```bash
semana-03/
│
├── Patient.java
├── Dentist.java
├── DentalTreatment.java
├── DentalAppointment.java
├── Clinic.java
├── Main.java
└── MEJORAS.md
```

---

# 🧩 Descripción de las Clases

## 👤 Patient
Representa a un paciente de la clínica.  
Incluye datos como nombre, documento, teléfono y correo.

**Mejoras aplicadas:**
- Validación de email
- Validación de campos vacíos
- Sobrecarga de constructores (completo, básico y mínimo)

---

## 🧑‍⚕️ Dentist
Modela a un odontólogo con nombre, especialidad y licencia profesional.

**Mejoras aplicadas:**
- Validación de strings no vacíos
- Constructores flexibles
- Método toString más descriptivo

---

## 🧾 DentalTreatment
Define un tratamiento dental (nombre, costo, duración minutos).

**Mejoras aplicadas:**
- Validación de costo positivo
- Validación de duración
- Tres constructores diferentes

---

## 📅 DentalAppointment
Representa una cita médica, relacionando:

- Patient
- Dentist
- Treatment

Incluye además fecha y hora.

**Mejoras aplicadas:**
- Validación de objetos null
- Validación de strings vacíos
- Constructores sobrecargados (completo, básico, mínimo)

---

## 🏥 Clinic
Clase que administra todas las citas registradas.

Incluye:

- Lista de citas (ArrayList)
- Búsqueda por ID
- Validación de citas null
- Sobrecarga de constructores

---

# 📘 Ejecución del Programa

## 📌 Compilar

```bash
javac *.java
