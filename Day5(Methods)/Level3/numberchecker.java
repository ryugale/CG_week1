import java.util.*;

public class numberchecker {
    public static void main(String[] args) {
        int number = 153; 
        
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));  
        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    }
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second Smallest digit: " + (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
    }
}