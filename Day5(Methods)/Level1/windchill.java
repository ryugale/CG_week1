import java.util.Scanner;

public class windchill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = scanner.nextDouble();
        
        windchill calculator = new windchill();
        
        System.out.printf("The wind chill temperature is: %.2f°F%n", calculator.calculateWindChill(temperature, windSpeed));
    }

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}