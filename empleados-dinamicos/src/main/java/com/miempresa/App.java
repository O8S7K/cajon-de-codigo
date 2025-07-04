package com.miempresa;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            Map<String, PoliticaDeSalario> politicas = PoliticasLoader.cargarDesdeJson("politicas.json");

            // Crear empleados con nombre, tipo y salario base
            Empleado e1 = new Empleado("Laura", "IT", 2000);
            Empleado e2 = new Empleado("Carlos", "LIMPIEZA", 1200);
            Empleado e3 = new Empleado("Julia", "VENTAS", 1800);

            // Mostrar el salario final de cada empleado
            mostrarSalario(e1, politicas);
            mostrarSalario(e2, politicas);
            mostrarSalario(e3, politicas);

        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
        }
    }

     /**
     * Muestra por consola el salario final del empleado, usando la política correspondiente.
     */
    private static void mostrarSalario(Empleado emp, Map<String, PoliticaDeSalario> politicas) {
        PoliticaDeSalario politica = politicas.get(emp.getCategoria());

        if (politica == null) {
            System.out.println(emp.getNombre() + ": tipo desconocido (" + emp.getCategoria() + ")");
            return;
        }

        double salarioFinal = politica.calcular(emp);
        System.out.println(emp.getNombre() + " (" + emp.getCategoria() + ") → Salario final: " + salarioFinal);
    }

}
