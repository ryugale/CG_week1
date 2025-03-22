
import java.util.*;

public class numberchecker3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        int digits = countDigits(number);
        System.out.println("Number of digits: " + digits);

        int[] arr = makeArray(number, digits);
        System.out.println("Number to array: " + Arrays.toString(arr));

        System.out.println("Reverese array: " + Arrays.toString(reverseArray(arr)));

        System.out.println("Compare two array: ");
        System.out.print("Enter the first array size: ");
        int arrayOneSize = sc.nextInt();
        System.out.print("Enter the second arrya size: ");
        int arrayTwoSize = sc.nextInt();

        System.out.print("Enter first array elements separated by space: ");
        int[] arrayOne = new int[arrayOneSize];
        for (int i = 0; i < arrayOneSize; i++) {
            arrayOne[i] = sc.nextInt();
        }

        System.out.print("Enter second array elements separated by space: ");
        int[] arrayTwo = new int[arrayTwoSize];
        for (int i = 0; i < arrayTwoSize; i++) {
            arrayTwo[i] = sc.nextInt();
        }

        System.out.println("Are the two arrays equal? " + isArrayEqual(arrayOne, arrayTwo));

        System.out.println("is " + number + "palindrome?: " + isPalindrome(number));

        System.out.println("is ducknumber?: " + isDuckNumber(arr));

    }

    static int countDigits(int number) {
        return (int) Math.log10(number) + 1;
    }

    static int[] makeArray(int number, int size) {
        int[] numberArray = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            numberArray[i] = number % 10;
            number /= 10;
        }
        return numberArray;
    }

    static int[] reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    static boolean isArrayEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(int num) {
        int reversed = 0;
        int originalNumber = num;
        while (num > 0) {
            reversed = (reversed * 10) + num % 10;
            num /= 10;
        }

        return originalNumber == reversed;
    }

    static boolean isDuckNumber(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;
    }

}
