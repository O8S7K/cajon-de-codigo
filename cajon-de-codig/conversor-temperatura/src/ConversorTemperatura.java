
public class ConversorTemperatura {

    public static void celsiusAFarnheit(double celsius) {
        double result = (celsius * 9 / 5) + 32;
        System.out.println(result);
    }

    public static void farentheitACelsius( double farentheit) {
        double result = (farentheit - 32) * 5 / 9;
        System.out.println(result);
    }
    
}