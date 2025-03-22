
import java.util.Arrays;
import java.util.Scanner;

public class texttowords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String sentence = scanner.nextLine();
        String[] wordsArray = split(sentence);
        String[] wordsArray2 = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(Arrays.toString(wordsArray2));
        System.out.println(compareStringArray(wordsArray, wordsArray2));
    }

    static String[] split(String sentence) {
        int space = 0;
        String word = "";
        int index = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                space++;
            }
        }
        System.out.println(space);
        String[] words = new String[space + 1];
        for (int i = 0; i <= space; i++) {
            while (index < sentence.length() && sentence.charAt(index) != ' ') {
                word += sentence.charAt(index);
                index++;
            }
            index++;
            words[i] = word;
            word = "";
        }
        return words;
    }

    static boolean compareStringArray(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
