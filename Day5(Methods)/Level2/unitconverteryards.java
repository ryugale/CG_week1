import java.util.Scanner;
class unitconverteryard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unit Conversion Options:");
        System.out.println("1. Yard to feet");
        System.out.println("2. feet to value");
        System.out.println("3. Meters to inches");
        System.out.println("4. inches to Meters");
        System.out.println("5. inches to cm");
        System.out.print("Choose an option (1-5): ");
        int choice = scanner.nextInt();
        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = convertYardsToFeet(value);
                System.out.println(value + " value is " + result + " feet");
                break;
            case 2:
                result = convertfeettoyards(value);
                System.out.println(value + " feet is " + result + " value");
                break;
            case 3:
                result = convertMetersToinches(value);
                System.out.println(value + " meters is " + result + " inches");
                break;
            case 4:
                result = convertinchesToMeters(value);
                System.out.println(value + " inches is " + result + " meters");
                break;
            case 5:
                result = convertinchesTocm(value);
                System.out.println(value + " inches is " + result + " cm");
                break;
            default:
                System.out.println("Invalid option selected.");
        }
    }
    public static double convertYardsToFeet(double value) {
        double yards2feet = 3;
        return value * yards2feet;
    }
    
    public static double convertfeettoyards(double value) {
        double feet2yards = 0.333333;
        return value * feet2yards;
    }
    
    public static double convertMetersToinches(double value) {
        double meters2inches = 39.3701;
        return value * meters2inches;
    }
    
    public static double convertinchesToMeters(double value) {
        double inches2meters = 0.0254;
        return value * inches2meters;
    }
    public static double convertinchesTocm(double value) {
        double inches2cm = 2.54;
        return value * inches2cm;
    }
}