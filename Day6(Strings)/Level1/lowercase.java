
import java.util.Scanner;

public class lowercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();
        String result1 = toUpper(str);
        System.out.println("With user defined method: " + result1);
        System.out.println("Comparing input and converted string with userdefined function:");
        System.out.println("Is both strings are same? : " + compareStrings(str, result1));
        String result2 = str.toLowerCase();
        System.out.println("Result 2: " + result2);
        System.out.println("comparing two strings with inbuild method? : " + compareStrings(result1, result2));
    }
    static String toUpper(String str) {
        String upperCase = "";
        for (int i = 0; i < str.length(); i++) {
            upperCase += (char) (str.charAt(i) + 32);
        }
        return upperCase;
    }

    static boolean compareStrings(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}