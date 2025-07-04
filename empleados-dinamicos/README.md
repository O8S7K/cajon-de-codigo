# 🧠 Empleados Dinámicos con Políticas de Salario (Java + Maven)

Este proyecto es una aplicación Java basada en Maven que simula el cálculo de salarios de empleados según su tipo (IT, HR, Limpieza, etc.) usando políticas de bonificación **cargadas dinámicamente desde un archivo JSON**.

✅ Ideal como base para un sistema de recursos humanos, CRM o ERP que necesite:
- Gestionar empleados
- Asignar políticas de salario flexibles
- Escalar sin tocar el código fuente

---

## 🚀 ¿Qué hace este proyecto?

- Define una clase `Empleado` que representa a un trabajador con nombre, tipo y salario base.
- Carga un archivo JSON con las reglas de bonificación por tipo de empleado.
- Aplica una **estrategia de cálculo de salario** para cada tipo.
- Permite añadir nuevos tipos de empleado sin modificar el código fuente (solo editando el JSON).

---

## 📦 Tecnologías utilizadas

- Java 17
- Maven
- Librería `org.json` para leer JSON
- Principios de diseño SOLID (especialmente Open/Closed y Strategy Pattern)
- VS Code como entorno de desarrollo

---

## 📁 Estructura del proyecto

empleados-dinamicos/
├── src/
│ ├── main/
│ │ ├── java/com/miempresa/
│ │ │ ├── Empleado.java
│ │ │ ├── PoliticaDeSalario.java
│ │ │ ├── PoliticasLoader.java
│ │ │ └── Main.java
│ │ └── resources/
│ │ └── politicas.json
├── pom.xml
├── README.md
└── .gitignore


## 🧪 Ejemplo de políticas (`politicas.json`)

```json
{
  "IT":       { "bono": 0.3 },
  "HR":       { "bono": 0.1 },
  "LIMPIEZA": { "bono": 0.05 },
  "VENTAS":   { "bono": 0.2 }
}