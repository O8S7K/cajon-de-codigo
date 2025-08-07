import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Contruir un array bidimensional
 

        System.out.println("Tic Tac Toe juego, cada casilla tiene dos numero corespodientes ");
        System.out.println("[11][12][13]");
        System.out.println("[21][22][23]");
        System.out.println("[31][32][33]");


        // Permitir al usuario modificar matriz basado en su input
        String[][] vacio = {{ "_", "_", "_" },
                { "_", "_", "_" },
                { "_", "_", "_" } };

        for (int i = 0; i < vacio.length; i++) {
            for (int j = 0; j < vacio[i].length; j++) {
                System.out.print(vacio[i][j] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nMarca el conjunto de numeros correpsodinete con el campo: ");
        int number = sc.nextInt();

        double quotient = number/10.0;

        System.out.println(quotient+ " dsvsdfgbvgfs34");
        int firstNumber = (int)(Math.floor(quotient));

        System.out.println(firstNumber+ " hheh");

        double secondNumber = Math.round((quotient - Math.floor(quotient))*10) ;

        System.out.println(secondNumber+ " hheh");

        sc.close();
    }
}
