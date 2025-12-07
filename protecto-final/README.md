# Proyecto Final: Sistema de Gestión Clínica Odontológica

## 👤 Información del Estudiante
- **Nombre**: Andres Gutierrez
- **Ficha**: [Número de ficha]
- **Dominio**: Clínica Odontológica
- **Fecha de entrega**: 07/12/2025

## 📝 Descripción del Sistema
Este sistema permite gestionar de manera integral una clínica odontológica.  
Permite registrar pacientes, agendar citas con dentistas predeterminados según el tratamiento seleccionado, listar citas, y buscar citas por código.

Cada tratamiento tiene un valor fijo y un dentista asignado, y cada cita almacena la información completa del paciente y del dentista.  
El sistema busca automatizar la gestión de citas y garantizar que los pacientes reciban atención de manera organizada, mostrando información clara de cada procedimiento.

## 🏗️ Arquitectura del Proyecto

### Diagrama de Clases

![Diagrama UML](https://raw.githubusercontent.com/felipegutierrezandres1-creator/bc-poo-java-andres-gutierrez/refs/heads/main/protecto-final/docs/DiagramaUMLProyectofinal.png)

### Estructura de Paquetes
```
com.ClinicaOdontologica/
├── modelo/ - Entidades del negocio
│ ├── abstractas/ - Clases abstractas
│ ├── interfaces/ - Interfaces
│ └── (clases concretas)
├── servicio/ - Lógica de negocio
├── excepciones/ - Excepciones personalizadas
└── Main9.java - Punto de entrada
```

## 🧬 Aplicación de Conceptos POO

### Herencia
- Clase padre: `Person9`
- Clases hijas: `Dentist9`, `Patient9`
- Justificación: La jerarquía permite compartir atributos comunes (id, nombre, edad) y métodos como `showInfo()` entre todos los tipos de personas en el sistema.

### Polimorfismo
- Métodos sobrescritos: `showInfo()` en `Dentist9` y `Patient9`
- Uso de colecciones polimórficas: Sí, la lista de `DentalProcedure9` almacena tanto tratamientos como citas.

### Abstracción
- Clase abstracta: `DentalProcedure9`
- Implementaciones: `CleaningAppointment9`, `BracesAppointment9`, `EndodonticsAppointment9`

### Excepciones Personalizadas
1. `DuplicateEntityException`: Se lanza al intentar agregar una entidad que ya existe.
2. `EntityNotFoundException`: Se lanza cuando no se encuentra una entidad al buscar por código.
3. `InvalidDataException`: Se lanza cuando los datos ingresados no cumplen con los criterios esperados.

### Colecciones
- `ArrayList<DentalProcedure9>`: Para almacenar tratamientos y citas, permitiendo agregar, listar y buscar.
- `ArrayList<Dentist9>`: Para manejar la lista de dentistas predeterminados.

## 🚀 Cómo Ejecutar

### Requisitos
- Java JDK 11 o superior
- IDE recomendado: IntelliJ IDEA

### Compilación
```bash
cd proyecto-final
javac -d bin src/com/ClinicaOdontologica/*/*.java src/com/ClinicaOdontologica/*.java
```
## Ejecución
```bash
java -cp bin com.ClinicaOdontologica.Main9
```
## Evidencia Fotografica

![Evidenca Fotografica1](https://raw.githubusercontent.com/felipegutierrezandres1-creator/bc-poo-java-andres-gutierrez/refs/heads/main/protecto-final/docs/proyectofinal1.PNG)
![Evidenca Fotografica2](https://raw.githubusercontent.com/felipegutierrezandres1-creator/bc-poo-java-andres-gutierrez/refs/heads/main/protecto-final/docs/proyectofinal2.PNG)
![Evidenca Fotografica3](https://raw.githubusercontent.com/felipegutierrezandres1-creator/bc-poo-java-andres-gutierrez/refs/heads/main/protecto-final/docs/proyectofinal3.PNG)


## 🎓 Reflexión Personal


### Desafíos encontrados
- Integrar la relación entre tratamientos, citas y dentistas predeterminados.
- Manejar la entrada de datos de manera segura y consistente.

### Aprendizajes clave
- Aplicación práctica de clases abstractas, herencia y polimorfismo.
- Gestión de colecciones y programación orientada a objetos en un proyecto real.
- Manejo de excepciones personalizadas para robustecer la aplicación.

### Mejoras futuras
- Agregar reportes avanzados y estadísticas de citas.
- Implementar actualización y eliminación de citas y pacientes.
- Permitir asignación dinámica de dentistas por disponibilidad.









