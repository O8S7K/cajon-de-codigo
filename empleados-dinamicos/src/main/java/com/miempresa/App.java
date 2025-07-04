package com.miempresa;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            // Llamamos al método que ya analizamos antes para cargar el JSON.
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
     * Toma el mapa de politicas y busca politicas adecuadas.
     * Busca politicas adecuadas segun categori de trabajo y lo calcula.
     */
    private static void mostrarSalario(Empleado emp, Map<String, PoliticaDeSalario> politicas) {
        //Buscamos en el mapa la política para ese tipo ("IT", "HR", etc.)
        PoliticaDeSalario politica = politicas.get(emp.getCategoria());

        if (politica == null) {
            System.out.println(emp.getNombre() + ": tipo desconocido (" + emp.getCategoria() + ")");
            return;
        }

        //Usamos la política correspondiente para calcular el salario final de ese empleado.
        double salarioFinal = politica.calcular(emp);
        System.out.println(emp.getNombre() + " (" + emp.getCategoria() + ") → Salario final: " + salarioFinal);
    }

}
