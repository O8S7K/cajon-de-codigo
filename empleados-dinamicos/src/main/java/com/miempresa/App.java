package com.miempresa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Empleado e = new Empleado("Oskar", "IT", 1500);

        System.out.println(e.getNombre());
    }
}
