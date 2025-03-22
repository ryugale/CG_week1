
import java.util.Scanner;
public class numberexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        throwException(str);
        throwExceptionAndHandel(str);
    }
    static void throwException(String str) {
        Integer.parseInt(str);
    }
    static void throwExceptionAndHandel(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Error");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}