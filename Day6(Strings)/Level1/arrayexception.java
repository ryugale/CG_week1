
import java.util.Scanner;
public class arrayexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[4];
        System.out.print("Enter 4 names seperated by space: ");
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }
        throwException(str);
        throwExceptionAndHandel(str);
    }
    static void throwException(String[] str) {
        String name = str[10];
    }

    static void throwExceptionAndHandel(String[] str) {
        try {
            String name = str[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}