public class TemperatureConverter {
    public static void main(String[] args) {
        final double FREESING_POINT = 32.0;
        final double CONVERSION_FACTOR = 5.0 / 9.0;
        double fahrenheit = 98;
        double celsius;

         celsius = CONVERSION_FACTOR * (fahrenheit - FREESING_POINT);
         System.out.println(fahrenheit + " degrees Fahrenheit = " +
         celsius + " degrees Celsius.");
        
    }
}
