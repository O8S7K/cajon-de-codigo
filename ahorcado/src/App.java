
//import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ahorcado *_*");

        String palabraOculta = userInput(sc).toLowerCase();
        String letraOculta = "";
        int vidas = 5;

        String[] progreso = new String[palabraOculta.length()];
        initSlots(progreso);

        while (Arrays.toString(progreso).contains("_") && perdido(vidas)) {
            letraOculta = inputLetter(sc);
            List<Integer> index = indexLetraOculta(palabraOculta, letraOculta);
            if (validarLetra(palabraOculta, letraOculta)) {
                progreso(progreso, index, letraOculta, palabraOculta);
            } else {
                vidas -= 1;
            }
            showInfo(progreso, vidas, palabraOculta, letraOculta);
        }
    }

    public static void showInfo(String[] progreso, int lifes, String palabraOculta, String letraOculta) {
        System.out.println("_______");
        System.out.println("\nPalabra oculta: ");
        System.out.println(Arrays.toString(progreso));
        System.out.println(validarLetra(palabraOculta, letraOculta) ? "" : "\nLetra invalida, prueba otra vez");
        System.out.println("Te quedan " + lifes + " vidas");
        System.out.println("_______");
    }

    public static boolean perdido(int vidas) {

        if (vidas != 0) {
            return true;
        } else {
            return false;
        }

    }

    public static List<Integer> indexLetraOculta(String palabraOculta, String letraOculta) {
        List<Integer> indexList = new ArrayList<>();
        char letra = letraOculta.charAt(0);
        for (int i = 0; palabraOculta.length() > i; i++) {
            if (palabraOculta.charAt(i) == letra) {
                indexList.add(i);
            }
        }
        return indexList;
    }

    public static boolean validarLetra(String palabraOculta, String letraOculta) {
        if (palabraOculta.contains(letraOculta)) {
            return true;
        } else {
            return false;
        }
    }

    public static String inputLetter(Scanner sc) {
        System.out.println("\nIntorduce una letra");
        String s = sc.nextLine();
        return s;
    }

    public static String userInput(Scanner sc) {
        System.out.println("\nIntorduce tu palabra oculta palabra");
        String txt = sc.nextLine();
        return txt;
    }

    public static void initSlots(String[] st) {
        for (int i = 0; st.length > i; i++) {
            st[i] = "_";
        }
    }

    public static void progreso(String[] progreso, List<Integer> indexList, String letraOculta, String palabraOculta) {
        for (int i = 0; indexLetraOculta(palabraOculta, letraOculta).size() > i; i++) {
            progreso[indexList.get(i)] = letraOculta;
        }
    }
}
