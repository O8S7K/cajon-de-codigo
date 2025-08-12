
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Player current = Player.O;

        System.out.println("Tic Tac Toe juego, cada casilla tiene dos numero corespodientes ");

        char[][] matrix = {
                { '-', '-', '-' },
                { '-', '-', '-' },
                { '-', '-', '-' }
        };
        printMatrix(matrix);

        // Entrada de usuario
        do {
            int[] fields = userInput(sc);
            if (validateInput(fields) && validateField(matrix, fields)) {
                matrix[fields[0]][fields[1]] = current.symbol();
                updateMatrix(matrix);
                current = current.next();
            }
            printMatrix(matrix);
            System.out.println(checkedWin(matrix) + "check for winner");
        } while (true);
    }

    public static char checkedWin(char[][] matrix) {

        int m = matrix.length;
        // row
        for (int i = 0; i < m; i++) {
            char firstMatch = matrix[i][0];
            if (firstMatch == '-') {
                continue;
            }
            boolean rowMatch = true;
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != firstMatch)
                    rowMatch = false;
            }
            if (rowMatch)
                return firstMatch;
        }
        // column
        for (int i = 0; i < m; i++) {
            char firstMatch = matrix[0][i];
            if (firstMatch == '-') {
                continue;
            }
            boolean rowMatch = true;
            for (int j = 1; j < m; j++) {
                if (matrix[j][i] != firstMatch)
                    rowMatch = false;
            }
            if (rowMatch)
                return firstMatch;
        }

        return '0';
    }

    public static boolean validateField(char[][] matrix, int[] input) {
        if (matrix[input[0]][input[1]] == ('-')) {
            return true;
        } else {
            System.out.println("Campo ocuapdo pueba con otro");
            return false;
        }
    }

    enum Player {
        O, X;
        Player next() {
            return this == O ? X : O;
        }
        char symbol() {
            return this == O ? 'O' : 'X';
        }
    }

    public static boolean validateInput(int[] fields) {
        int[] coordinates;
        boolean valid;
        do {
            coordinates = fields; // returns [row, col]
            valid = inRange(coordinates[0]) && inRange(coordinates[1]);
            if (!valid) {
                System.out.println("Campo inválido, intente de nuevo");
                return false;
            }
            return true;
        } while (!valid);
    }

    private static boolean inRange(int x) {
        return x >= 0 && x <= 2;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void updateMatrix(char[][] matrix) {
        var x = new char[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                x[i][j] = (matrix[i][j]);
            }
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
