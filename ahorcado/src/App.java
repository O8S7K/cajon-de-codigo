import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> letrasPalabra = new ArrayList<>();
        System.out.println("*_* Ahorcado *_*");

        // Anadir un palabra nueva
        System.out.println("\n Aniade una palabra");
        String palabra = sc.nextLine();

        // Convertir String a ArrayString
        String[] e = stringToArray(palabra);

        // Anadir letra por letra
        for (String i : e) {
            letrasPalabra.add(i);
        }

        // Crear un areglo nuevo para las letras acertadas
        System.out.println("__Adivina las letras__");
        ArrayList<String> letrasAcertadas = new ArrayList<>();

        for (int i = 0; i < letrasPalabra.size(); i++) {
            letrasAcertadas.add("_");
        }

        System.out.println(letrasAcertadas);

        int intentos = letrasPalabra.size();

        // Bucle para idenitificar li las palabras intrudciodas por usuario exsitne en las palabra
        while (letrasAcertadas.contains("_")) {
            String letra = sc.nextLine();
            for (int i = 0; i < letrasPalabra.size(); i++) {
                if (letrasPalabra.get(i).equals(letra)) {
                    int a = palabra.indexOf(letrasPalabra.get(i));
                    letrasAcertadas.set(a, letra);
                } 
            }
            intentos--;
            System.out.println("\n Te quedan" + intentos + " intentos" );

            System.out.println("\n" + letrasAcertadas);

            if (intentos <= 0 && letrasAcertadas.contains("_")) {
                System.out.println("\n*_* *_* *_* *_*");
                System.out.println("_Has muerto_");
                break;
            }
        }

        sc.close();
    }

    public static String[] stringToArray(String palabra) {
        String[] letras = palabra.split("");
        return letras;
    }
}
