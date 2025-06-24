import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String conversion;
        double temp, result;

        System.out.println("__Conversos de temperatura__");

        System.out.println("\nTeclea 'f' para conversion Fº -> Cº");
        System.out.println("nTeclea 'c' para conversion Cº -> Fº");

        System.out.print("\nTu elecion:");
        conversion = sc.nextLine();

        // Asegurara correcto input de usuario
        while (true) {
            if (conversion.equals("c") || conversion.equals("f")) {
                 break;
            } else {
                System.out.println("\nTeclea una opcion valida");
                conversion = sc.nextLine();
            }
        }
        // Conversion de tempearatura
        if (conversion.equals("f")) {
            System.out.println("\nTu elecion es convertir de farenheit to celsius");
            System.out.print("Escribe temperatura en farenhein: ");
            temp = sc.nextDouble();
            result = ConversorTemperatura.farentheitACelsius(temp);
            System.out.println(temp + " farenthein es: " + Math.round(result * 10.0) / 10.0 + " celsius");
        } else {
            System.out.println("\nTu elecion es convertir de celsius to farenheit");
            System.out.print("Escribe temperatura en celsius: ");
            temp = sc.nextDouble();
            result = ConversorTemperatura.celsiusAFarnheit(temp);
            System.out.println(temp + " celsusis es: " + Math.round(result) + " farenheit");
        }
        sc.close();
    }
}
