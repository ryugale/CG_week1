import java.util.Scanner;
class unitconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Unit Conversion Options:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Choose an option (1-4): ");
        int choice = scanner.nextInt();
        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = convertKmToMiles(value);
                System.out.println(value + " km is " + result + " miles");
                break;
            case 2:
                result = convertMilesToKm(value);
                System.out.println(value + " miles is " + result + " km");
                break;
            case 3:
                result = convertMetersToFeet(value);
                System.out.println(value + " meters is " + result + " feet");
                break;
            case 4:
                result = convertFeetToMeters(value);
                System.out.println(value + " feet is " + result + " meters");
                break;
            default:
                System.out.println("Invalid option selected.");
        }
    }
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}