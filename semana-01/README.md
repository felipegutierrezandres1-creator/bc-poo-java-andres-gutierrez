# Semana 01 - Introducion al Paradigma Orientado a Objetos

## 📝 Descripción

La Programación Orientada a Objetos surgió como una respuesta a los problemas de mantenimiento y complejidad que tenían los programas en sus primeras etapas. En los años sesenta y setenta se hablaba de una “crisis del software”, y fue entonces cuando aparecieron lenguajes como Simula y Smalltalk, que introdujeron las ideas de clases, objetos, herencia y comunicación entre ellos.
Con el tiempo, lenguajes como C++, Python y Java adoptaron estos conceptos, haciendo que el desarrollo de software fuera más claro, reutilizable y ordenado.

Se dio explicacion de los diferentes paradigmas de programación.
El paradigma estructurado organiza el código en funciones que procesan datos globales. Es sencillo, pero cuando el programa crece se vuelve difícil de mantener.
La programación orientada a objetos, en cambio, organiza el código en clases que representan entidades del mundo real. Cada clase tiene atributos (sus datos) y métodos (sus acciones). Esto permite dividir un programa grande en partes más pequeñas y fáciles de entender.

Los pilares fundamentales de la POO son cuatro:

- **Encapsulación:** mantener los datos protegidos dentro de una clase.
- **Herencia:** permitir que una clase derive de otra y reutilice su código.
- **Polimorfismo:** que un mismo método pueda comportarse de distintas formas.
- **Abstracción:** centrarse solo en lo esencial y ocultar los detalles innecesarios.

Durante la práctica se creó el primer programa orientado a objetos en Java. En él se definió una clase con atributos y métodos, y luego se crearon objetos a partir de ella. Una clase funciona como un molde, mientras que los objetos son los resultados concretos que se pueden usar en el programa.

Finalmente, se revisaron las ventajas y desventajas de este enfoque. La POO permite un código más claro, seguro y fácil de mantener, aunque también exige una mejor planificación y puede resultar más compleja al inicio.
Aun así, es el modelo más utilizado actualmente y la base de la mayoría de los lenguajes modernos.

## 🎯 Objetivos Cumplidos

- [x] Implementar clase principal del dominio
- [x] Implementar clase secundaria relacionada
- [x] Crear programa de demostración
- [x] Documentar análisis del dominio

## 📂 Archivos Entregados

- `src/CitaOdontologica.java` - Representa una cita dental con datos del paciente, odontólogo, servicio, fecha y hora.
- `src/Paciente.java` - Define los datos básicos de un paciente y permite mostrar su información.
- `src/Main.java` - Programa de demostración
- `docs/ANALISIS.md` - Análisis del dominio

## 🚀 Instrucciones de Ejecución

```bash
cd src
javac *.java
java Main
```

## Salida Esperada

```bash
PS C:\Users\felip\OneDrive\Escritorio\bc-poo-java-andres-gutierrez\semana-01\src> java Main   
Cita No.: CITA-001
Paciente: María Pérez
Odontólogo: Dr. Gómez
Servicio: Limpieza Dental
Fecha: 31/10/2025
Hora: 08:00 AM
----------------------
Cita No.: CITA-002
Paciente: Carlos Gómez
Odontólogo: Dra. López
Servicio: Ortodoncia
Fecha: 01/02/2025
Hora: 09:30 AM
----------------------
Cita No.: CITA-003
Paciente: Laura Rodríguez
Odontólogo: Dr. Ramírez
Servicio: Endodoncia
Fecha: 08/10/2025
Hora: 11:00 AM
----------------------
Paciente: María Pérez
Documento: 1000035437
Teléfono: 3175562627
Correo: Maria.perez@gmail.com
----------------------
Paciente: Carlos Gómez
Documento: 20916453
Teléfono: 3167933953
Correo: Carlos.gomez@gmail.com
----------------------
Paciente: Laura Rodríguez
Documento: 80476879
Teléfono: 3232880272
Correo: Laura.rodriguez@gmail.com
----------------------
```