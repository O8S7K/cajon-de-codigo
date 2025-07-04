package com.miempresa;

public class Empleado {
    private String nombre;
    private String categoria;
    private double salarioBase;

    public Empleado(String nombre, String categoria, double salarioBase) {
        this.nombre = nombre;
        this.categoria = categoria.toUpperCase();
        this.salarioBase = salarioBase;
    }

    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getSalarioBase() { return salarioBase; }

}
