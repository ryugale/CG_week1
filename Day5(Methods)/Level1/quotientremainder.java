import java.util.Scanner;

class quotientremainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the num: ");
        int num = scanner.nextInt();
        
        System.out.print("Enter the div: ");
        int div = scanner.nextInt();
        
        
        int[] result = findRemainderAndQuotient(num, div);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }

    public static int[] findRemainderAndQuotient(int num, int div) {
        int quotient = num / div;
        int remainder = num % div;
        
        return new int[]{quotient, remainder};
    }
}