# Diagrama de herencia

        Person
          │
    ┌─────┴─────┐
    │           │
    Dentist3   Client3

## Justificación
Elegí esta jerarquía porque tanto **Dentist3** como **Client3** comparten información básica de una persona: nombre, identificación, teléfono y correo.  
En lugar de repetir estos atributos y métodos en cada clase, se centralizan en la clase **Person**, lo que hace el código más ordenado, reutilizable y fácil de mantener.  
Cada clase hija agrega información específica según su rol en la clínica.

## Atributos Heredados
Estos atributos provienen de la clase **Person** y los comparten tanto Dentist3 como Client3:

- `fullName` (String)
- `idNumber` (int)
- `phoneNumber` (String)
- `email` (String)

## Métodos Sobrescritos
- `showPersonInfo()`:
    - **En Dentist3:** agrega información adicional como *especialidad* y *licencia profesional*.
    - **En Client3:** agrega información especial del paciente como *contacto de emergencia* y *condición médica*.

Cada clase modifica este método para mostrar información específica, demostrando polimorfismo.
