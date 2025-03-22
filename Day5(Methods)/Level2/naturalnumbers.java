import java.util.Scanner;

class naturalnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive natural number.");
            return;
        }
        int sumRecursive = findSumRecursive(num);

        int sumFormula = findSumFormula(num);

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both computations match. The result is correct!");
        } else {
            System.out.println("Mismatch in computations. Please check the logic.");
        }
    }
    
    public static int findSumRecursive(int num) {
        if (num == 0) {
            return 0;
        }
        return num + findSumRecursive(num - 1);
    }
    
    public static int findSumFormula(int num) {
        return num * (num + 1) / 2;
    }
}