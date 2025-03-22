import java.util.Scanner;

class numberofchocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the numchoco: ");
        int numchoco = scanner.nextInt();
        
        System.out.print("Enter the numchildren: ");
        int numchildren = scanner.nextInt();
        
        
        int[] result = findRemainderAndQuotient(numchoco, numchildren);

        System.out.println("The number of chocolates each child gets is: " + result[0]);
        System.out.println("The number of remaining chocolates is " + result[1]);
    }

    public static int[] findRemainderAndQuotient(int numchoco, int numchildren) {
        int quotient = numchoco / numchildren;
        int remainder = numchoco % numchildren;
        
        return new int[]{quotient, remainder};
    }
}