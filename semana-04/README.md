# Semana 04 – Herencia, Clases Derivadas y Polimorfismo en Java

Este proyecto implementa una jerarquía de clases usando **herencia**, **sobrescritura de métodos** y **polimorfismo**.  
Se centra en un sistema simple de una clínica dental, donde existe una **clase padre (Person)** y dos clases hijas: **Dentist3** y **Client3**.

---

## 📌 Objetivo del Ejercicio
- Crear una **clase padre** con atributos y métodos comunes.
- Crear dos **clases hijas** que hereden de la clase padre.
- Sobrescribir métodos para aplicar **polimorfismo**.
- Construir un **Main** que use un arreglo polimórfico para demostrar el comportamiento.

---

# 🧩 Diagrama de Herencia

        Person
          │
    ┌─────┴─────┐
    │           │
    Dentist3   Client3
---

## 🧬 Clase Padre: Person

La clase **Person** representa cualquier persona dentro del sistema.  
Contiene atributos compartidos que son útiles tanto para dentistas como para clientes.

### ✔️ Atributos
- `fullName` (String)
- `idNumber` (int)
- `phoneNumber` (String)
- `email` (String)

### ✔️ Métodos
- `showPersonInfo()` → muestra información básica de la persona.

---

# 👩‍⚕️ Clase Hija: Dentist3

Representa a un dentista dentro de la clínica.

### ✔️ Atributos Propios
- `specialty` (String)
- `professionalLicense` (String)

### ✔️ Sobrescritura
Sobrescribe `showPersonInfo()` para agregar:
- Especialidad
- Licencia profesional

---

# 👤 Clase Hija: Client3

Representa un paciente/cliente de la clínica.

### ✔️ Atributos Propios
- `emergencyContactName` (String)
- `emergencyContactPhone` (String)
- `condition` (String)

### ✔️ Sobrescritura
Modifica `showPersonInfo()` para agregar:
- Contacto de emergencia
- Condición actual o motivo de consulta

---

# 🧪 Ejemplo de Polimorfismo (Main)

```java
public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[3];

        people[0] = new Dentist3(
                "Dr. Gómez", 12345, "3001112233", "gomez@clinic.com",
                "Orthodontics", "OP-5534"
        );

        people[1] = new Client3(
                "María Pérez", 99887, "3175562627", "maria@gmail.com",
                "Carlos Pérez", "3105558899", "Dolor de muela"
        );

        people[2] = new Dentist3(
                "Dra. López", 54321, "3005557799", "lopez@clinic.com",
                "Endodontics", "OP-8891"
        );

        // Polimorfismo
        for (Person p : people) {
            p.showPersonInfo();
            System.out.println("------------------");
        }
    }
}
```
## Salida esperada
```bash
"C:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.1\lib\idea_rt.jar=63572" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Aprendiz\Desktop\bc-poo-java-andres-gutierrez\out\production Main4
Name:Dr. Gómez
ID Number:12345
Phone Number:3124567890
Email:gomez@clinic.com
Specialty: Orthodontics
License: LIC-5543
Name:Laura Martínez
ID Number:998877
Phone Number:3005678901
Email:laura@gmail.com
Type: Client
Emergency Contact: María Martínez (3101234567)
Condition: Dolor de Muelas
Name:Dra. López
ID Number:56789
Phone Number:3209876543
Email:lopez@clinic.com
Specialty: Endodontics
License: LIC-8832

Process finished with exit code 0
```