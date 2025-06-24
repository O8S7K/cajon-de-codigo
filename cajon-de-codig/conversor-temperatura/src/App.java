import java.io.Reader;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String conversion;
        double temp;

        System.out.println("__Conversos de temperatura__");

        System.out.println("\nTeclea 'f' para conversion Fº -> Cº");
        System.out.println("nTeclea 'c' para conversion Cº -> Fº");

        System.out.print("\nTu elecion:");
        conversion = sc.nextLine();

     
        while (true) {
            if (conversion.equals("c") || conversion.equals("f")) {
                 break;
            } else {
                System.out.println("\nTeclea una opcion valida");
                conversion = sc.nextLine();
            }
        }

        if (conversion.equals("f")) {
            System.out.println("\nTu elecion es convertir de farenheit to celsius");
            System.out.print("Escribe temperatura: ");
            temp = sc.nextDouble();
            ConversorTemperatura.farentheitACelsius(temp);
        } else {
            System.out.println("\nTu elecion es convertir de celsius to farenheit");
            System.out.print("Escribe temperatura: ");
            temp = sc.nextDouble();
            ConversorTemperatura.celsiusAFarnheit(temp);
        }

    }
}
