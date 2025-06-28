import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("__ TODO LIST __");
    Scanner sc = new Scanner(System.in);

    String input;
    int id = 1;

    ArrayList<Tarea> tareas = new ArrayList<>();

    System.out.println("\nAniade una tarea nueva");
    System.out.println("Quieres guardar tus lista escribe 'save'");

    while (true) {
      System.out.print("\nTarrea nueva: ");
      input = sc.nextLine();
      if (input.equals("save")) {
        break;
      }
      Tarea nuevaTarea = new Tarea(id, input, false); // ✅ nueva instancia cada vez
      tareas.add(nuevaTarea);
      id++; // ✅ incrementar el ID después de añadir
    }

    for (Tarea t : tareas) {
      System.out.println("[" + t.getId() + "] " + t.getContent());
    }

    sc.close();
  }
}
