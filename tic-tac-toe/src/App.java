import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tic Tac Toe juego, cada casilla tiene dos numero corespodientes ");
        // Mostrar el tablero

        var matrix = new String[3][3];
        printMatrix(matrix);

        int[] fields = userInput(sc);

        matrix[fields[0]][fields[1]] = "x" + " ";

        updateMatrix(matrix);

        // Entrada de usuario

    }

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] = "-" + " ");
            }
            System.out.println();
        }
    }

    public static void updateMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] userInput(Scanner sc) {
        System.out.println("\nMarca el conjunto de numeros correpsodinete con el campo: ");
        int number = sc.nextInt();

        double quotient = number / 10.0;
        int firstNumber = (int) (Math.floor(quotient)) - 1;
        int secondNumber = (int) Math.round((quotient - Math.floor(quotient)) * 10) - 1;

        int[] input = { firstNumber, secondNumber };
        return input;
    }
}
