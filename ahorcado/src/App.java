
//import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ahorcado *_*");

        String palabraOculta = userInput(sc);
        
        String [] progreso = new String[palabraOculta.length()];

        initSlots(progreso);

        System.out.println(Arrays.toString(progreso));

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

    public static void initSlots(String [] st) {
        for (int i = 0; st.length > i; i++) {
            st[i] = "_";
        }
    }

}
