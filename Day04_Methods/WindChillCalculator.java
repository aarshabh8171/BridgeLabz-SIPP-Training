import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula valid for temperatures <= 50F and wind speeds > 3 mph
        if (temperature > 50 || windSpeed <= 3) {
            return temperature;
        }
        double windChill = 35.74 + 0.6215 * temperature 
                         - 35.75 * Math.pow(windSpeed, 0.16) 
                         + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WindChillCalculator calculator = new WindChillCalculator();

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);

        scanner.close();
    }
}
