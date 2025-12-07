# Análisis de Diseño - Semana 06: Sistema de Gestión Odontológica

## 1. Identificación de Abstracciones

### Clase Abstracta: **PersonBase**

**¿Por qué es abstracta?**
- Representa una entidad general que *no debe instanciarse directamente*.
- Comparte atributos comunes para cualquier persona dentro del consultorio:  
  **fullName, id, phoneNumber**
- Define comportamiento común: getters, setters y validación básica.
- Deja comportamiento especializado a las subclases:
    - `Patient6` agrega diagnóstico.
    - `Dentist6` agrega especialidad.
    - `Assistant6` agrega turno.

**Jerarquía:**

           <<abstract>>
            PersonBase
    ┌────────────┼────────────┐
    │            │            │
    Patient6    Dentist6     Assistant6


---

## 2. Interfaces Implementadas

### Interface: **Schedulable**
**Capacidad que define:**  
Permite que una entidad pueda agendar citas dentro del sistema.

**Método principal:**
- `schedule()`

**Clases que la implementan:**
- `Appointment6`: porque una cita médica debe poder programarse.
- `Dentist6`: porque un odontólogo puede confirmar/agendar atenciones.

---

## 3. Decisiones de Diseño

### ¿Por qué Clase Abstracta vs Interface?

**Elegí clase abstracta para `PersonBase` porque:**
- Todas las subclases *son un tipo de persona* (relación **es-un**).
- Necesitaban **compartir atributos**.
- Requieren parte de la lógica implementada.

**Elegí interface `Schedulable` porque:**
- Es una **capacidad**, no una jerarquía.
- Permite que múltiples clases la implementen libremente.
- Evita forzar herencia innecesaria.

---

## 4. Principios SOLID Aplicados

### **SRP – Single Responsibility Principle**
- Cada clase tiene una responsabilidad:
    - `Patient6`: gestionar datos del paciente.
    - `Dentist6`: gestionar información del odontólogo.
    - `Appointment6`: manejar la lógica de citas.
    - `Assistant6`: representar un asistente.

### **OCP – Open/Closed Principle**
- Puedo agregar nuevas personas (Higienista, Recepcionista)  
  sin modificar `PersonBase`.

### **LSP – Liskov Substitution Principle**
- Cualquier `Patient6`, `Dentist6` o `Assistant6` puede usarse como una `PersonBase`.

### **ISP – Interface Segregation Principle**
- `Schedulable` solo define lo necesario para agendar, sin métodos extras.

### **DIP – Dependency Inversion Principle**
- `Appointment6` depende de abstracciones (`Schedulable`), no de clases concretas.

---

## 5. Mejoras Logradas

### **Antes (Semana 05):**
- Clases sin herencia ni abstracción.
- Código repetido en cada clase.
- Métodos poco organizados.

### **Después (Semana 06):**
- Herencia limpia con `PersonBase`.
- Interfaces para capacidades específicas.
- Código más mantenible, escalable y reutilizable.
- Se añadió manejo de citas (`Appointment6`).

---

## 6. Diagrama de Clases

               <<abstract>>
                 PersonBase
    fullName / id / phoneNumber (protected)
    ┌───────────────┼────────────────┐
    │               │                │
    Patient6 Dentist6 Assistant6
    diagnosis specialty shift
    │
    └── implements Schedulable


---

## 7. Desafíos y Soluciones

### **Desafío 1:**
Acceso a atributos protegidos desde otras clases.

**Solución:**  
Usar getters públicos en `PersonBase`.

---

### **Desafío 2:**
Cantidad incorrecta de argumentos al crear objetos.

**Solución:**  
Revisar constructores y unificarlos en todos los archivos.

---

### **Desafío 3:**
Error al ejecutar `Main6` por archivo mal ubicado.

**Solución:**  
Verificar nombres de archivo, empaquetado y ubicación en el proyecto.

---

## 8. Próximos Pasos

- Agregar clase `Clinic` para manejar múltiples citas.
- Implementar cancelación de citas.

---

