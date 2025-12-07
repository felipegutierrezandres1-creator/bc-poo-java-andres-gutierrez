# Semana 08: Colecciones y Generics - Clínica Dental

## 👤 Información del Estudiante
- **Nombre**: Andres Felipe Gutierrez Bautista
- **Ficha**: 3228970A
- **Dominio**: Clínica Dental
- **Fecha**: 05/12/2025

## 📝 Descripción del Proyecto

Esta semana se refactorizó el sistema para usar **colecciones profesionales** (`HashMap`, `ArrayList`) en lugar de arrays.  
Se agregaron operaciones de **búsqueda rápida**, **filtrado**, **estadísticas** y **gestión de pagos**, mejorando la eficiencia y la escalabilidad del sistema.

---

## 📦 Colecciones Utilizadas

### HashMap
- `Map<String, DentalAppointment8>` → Búsqueda rápida de citas por ID
- `Map<String, Double>` → Registro de pagos por cita

### ArrayList
- `List<DentalAppointment8>` → Lista completa de citas
- `List<Double>` → Historial de pagos

---

## 🔍 Operaciones Implementadas

### Gestión de Citas (CRUD)
- ✅ Agregar cita con validación de duplicados (`AppointmentAlreadyExistsException`)
- ✅ Buscar cita por ID (`AppointmentNotFoundException`)
- ✅ Eliminar cita por ID
- ✅ Listar todas las citas

### Filtrado
- ✅ Filtrar citas por **dentista**
- ✅ Filtrar citas por **paciente**

### Estadísticas
- ✅ Total de citas
- ✅ Conteo de citas por tratamiento
- ✅ Total de pagos realizados
- ✅ Promedio de pagos

### Pagos
- ✅ Registrar pagos de citas
- ✅ Validación de pagos negativos (`IllegalArgumentException`)
- ✅ Consultar pagos por cita

---

## 🚀 Cómo Ejecutar

### Desde terminal:
```bash
cd semana-08
javac -d bin src/com/clinica8/*/*.java src/com/clinica8/*.java
java -cp bin com.clinica8.main.Main8
```

# Nomenclatura de Colecciones y Generics - Clínica Dental

| Estructura | Convención           | Ejemplo                                         |
|------------|--------------------|------------------------------------------------|
| HashMap    | [entidad]Por[Clave] | appointmentsById = Map<String, DentalAppointment8> |
| ArrayList  | lista[Entidad]       | appointments = List<DentalAppointment8>      |
| ArrayList  | historial[Entidad]   | paymentsHistory = List<Double>                |
| Set        | [entidad]Unicas      | treatmentsUnicas = Set<DentalTreatment8>     |


# Generics
Map<String, DentalAppointment8> appointmentsById = new HashMap<>();
List<DentalAppointment8> appointments = new ArrayList<>();


