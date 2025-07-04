package com.miempresa;

// Lee archivos dentro del proyecto (como recursos).
import java.io.InputStream;

// Captura errores de lectura.
import java.io.IOException;

// Guardan las políticas de salario por tipo de empleado.
import java.util.HashMap;
import java.util.Map;

// Representa objetos tipo { "IT": { "bono": 0.3 } }
import org.json.JSONObject;

// Convierte texto o stream en un objeto JSON.
import org.json.JSONTokener;



public class PoliticasLoader {

    //Método público y estático, para que puedas llamarlo desde cualquier parte sin crear un objeto
    //Recibe el nombre del archivo JSON (como "politicas.json").
    //Devuelve un Map<String, PoliticaDeSalario>,
    public static Map<String, PoliticaDeSalario> cargarDesdeJson(String archivo) throws IOException {
        
        // Usamos getClassLoader().getResourceAsStream(...) para leer archivos que están dentro de src/main/resources.
        InputStream is = PoliticasLoader.class.getClassLoader().getResourceAsStream(archivo);
        if (is == null) throw new IOException("Archivo no encontrado: " + archivo);

        // Creamos un objeto JSON desde el contenido del archivo.
        JSONObject json = new JSONObject(new JSONTokener(is));

        // Creamos el mapa que vamos a devolver
        Map<String, PoliticaDeSalario> mapa = new HashMap<>();

        // Iteramos por todas las claves del JSON.
        for (String tipo : json.keySet()) {

            // Para cada tipo, leemos el valor del campo bono.
            double bono = json.getJSONObject(tipo).getDouble("bono");
            //Creamos una lambda (función anónima) que implementa la interfaz PoliticaDeSalario, y la guardamos en el mapa.
            mapa.put(tipo.toUpperCase(), emp -> emp.getSalarioBase() * (1 + bono));
        }

        //Devolvemos el mapa completo con todas las estrategias listas.

        return mapa;
    }
}
