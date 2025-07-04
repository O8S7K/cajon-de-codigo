package com.miempresa;

// Anotación que indica que esta interfaz solo puede tener un único método abstracto. 
// Esto permite usar expresion lambda x -> x.getsomthing.
@FunctionalInterface

// Declaramos una interfaz con un único método llamado calcular.
public interface PoliticaDeSalario {
    double calcular(Empleado empleado);
}
