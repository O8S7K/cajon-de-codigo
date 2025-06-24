
public class ConversorTemperatura {

    public static double celsiusAFarnheit(double celsius) {
        double result = (celsius * 9 / 5) + 32;
        return result;
    }

    public static double farentheitACelsius( double farentheit) {
        double result = (farentheit - 32) * 5 / 9;
        return result;
    }
    
}