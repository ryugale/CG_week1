import java.util.Scanner;

public class dayofweek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Date: ");
        int date = scanner.nextInt();
        System.out.println("Enter month (1 for Jan, 2 for Feb): ");
        int month = scanner.nextInt();
        System.out.println("Enter the year");
        int year = scanner.nextInt();

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (date + x + (31 * m0) / 12) % 7;

        System.out.println(d0) ;

        
    }
}