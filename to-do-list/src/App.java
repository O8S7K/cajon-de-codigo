import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Tarea tarea = new Tarea(1, "Tarea nueva", false);
        
        ArrayList<Tarea> tareas = new ArrayList<>();

        String in = sc.nextLine();
        tarea.setContent(in);

        tareas.add(tarea);

        for (Tarea t : tareas) {
          System.out.println(t.getContent());
          System.out.println(t.getId());
        }
        sc.close();
    }
}
