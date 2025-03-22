
import java.util.*;

public class numberchecker2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        int digits = countDigits(number);
        System.out.println("Number of digits: " + digits);

        int[] arr = makeArray(number, digits);
        System.out.println("Sum of array: " + sumOfArray(arr));
        System.out.println("Sum of Squares: " + sumOfSquareOfDigits(arr));

        int[][] freqArray = frequency(number);
        for (int i = 0; i < freqArray.length; i++) {
            if (freqArray[i][1] > 0) {
                System.out.println(Arrays.toString(freqArray[i]));
            }
        }

    }

    static int countDigits(int number) {
        return (int) Math.log10(number) + 1;
    }

    static int[] makeArray(int number, int size) {
        int[] numberArray = new int[size];

        for (int i = 0; i < size; i++) {
            numberArray[i] = number % 10;
            number /= 10;
        }
        return numberArray;
    }

    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    static int sumOfSquareOfDigits(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += (int) Math.pow(num, 2);
        }
        return sum;
    }

    static int[][] frequency(int number) {
        int size = (int) Math.log10(number) + 1;
        int originalNumber = number;
        int[][] frequencyArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            int digit = number % 10;
            frequencyArray[i][0] = i;
            if (number > 0) {
                frequencyArray[digit][1]++;
            }
            number /= 10;
        }

        return frequencyArray;
    }

}
