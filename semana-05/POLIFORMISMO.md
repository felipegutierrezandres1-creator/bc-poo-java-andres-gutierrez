# Análisis de Polimorfismo - [Tu Dominio]

## 1. Sobrecarga (Overloading)

### Métodos Sobrecargados
- `showAppointments(Muestra todas la citas)`
- `showAppointments(String date)`
- `showAppointments(Patient4 patient)`
- `showAppointments(Assistant assistant)`

### Justificación
El tema principal de mi dominio es el agendamiento de citas para una clinica odontologica, adicional a esto el programa permite revisar las citas ya sea ubicandolas por infomacion general, fecha, paciente o asistente de el tratamiento que se vaya a dar.


---

## 2. Sobrescritura (Overriding)

### Tabla Comparativa

| Método | Clase Padre | Subclase 1                   | Subclase 2                      | Subclase 3                         | Subclase 4                                    |
|--------|-------------|------------------------------|---------------------------------|------------------------------------|-----------------------------------------------|
| `showAppointments` | abstract | Mostrar las citas <br/>en general | Mostrar las citas<br/>por fecha | Mostrar las citas<br/>por paciente | Mostrar las citas<br/>por asistente de medico |

### Código Ejemplo

```bash
@Override
    public void showPersonInfo() {
        super.showPersonInfo();
        System.out.println("Turn: " + turn);
        System.out.println("Area: " + area);
        System.out.println("Supervisor: " + supervisorName);
```
Este `@override` nos permite llamar al mismo metodo y usarlo para dar un resultado diferente en este caso `showPerson` nos muestra una informacion basica ej: Nombre, ID, numero de telefono, etc, sin embargo nos permite agregar mas informacion, en este caso informacion adicional del asistente, como el turno, area y supervisor.

---

## 3. Polimorfismo Dinámico

### Ejemplo de Dynamic Binding
```bash
public void showPersonRole(Person2 person) {
        System.out.println("=== Checking person type ===");

        if (person instanceof Patient4) {
            System.out.println(person.getFullName() + " is a PATIENT.");
        } else if (person instanceof Assistant) {
            System.out.println(person.getFullName() + " is an ASSISTANT.");
        } else if (person instanceof Dentist4) {
            System.out.println(person.getFullName() + " is a DENTIST.");
        } else {
            System.out.println(person.getFullName() + " is a generic PERSON.");
        }
    }
```

### Explicación [Main5.java](src/Main5.java)

```bash
Person2 p = new Patient4(
        "Andrés", 123, "3001234567", "a@mail.com",
        22, "Male", "Endodoncia", "Juan", "3013344556"
);

p.showPersonInfo();
```
Aunque `p` está declarado como Person2, el programa ejecuta automáticamente la versión del método correspondiente a Patient4.

---

## 4. Beneficios

## 4. Beneficios

### Flexibilidad
- El sistema permite usar una misma referencia para manejar distintos tipos de objetos (Patient4, Assistant, Dentist3).
- Ejemplo:
```bash
  Person2 persona = new Patient4(...);
  system.showPersonRole(persona);
```
- El comportamiento correcto se ejecuta automáticamente según el tipo real del objeto.

### Extensibilidad
- Se pueden agregar nuevas clases hijas como Dermatologist, Surgeon, Receptionist, etc.
- Solo deben heredar de Person2 y sobrescribir los métodos necesarios.
- No es necesario modificar el Main ni AppointmentSystem.

### Mantenibilidad
- Si se cambia la implementación de un método sobrescrito (por ejemplo showPersonInfo),
  todas las partes del sistema usarán automáticamente la nueva versión.
```bash
@Override
public void showPersonInfo() {
    // nueva lógica
}
```
- Esto reduce errores y facilita actualizar o mejorar el código.
