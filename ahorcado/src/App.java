
//import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ahorcado *_*");

        String palabraOculta = userInput(sc);
        String letraOculta = inputLetter(sc);

        String[] progreso = new String[palabraOculta.length()];
        initSlots(progreso);

        System.out.println(validarLetra(palabraOculta, letraOculta));

        

        System.out.println(indexLetraOculta(palabraOculta, letraOculta));

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

    public static void showInfo(String[] progreso) {
        System.out.println("\n_______");
        System.out.println(Arrays.toString(progreso));
        System.out.println("\n_______");
    }

    public static String inputLetter(Scanner sc) {
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

}
