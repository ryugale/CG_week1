import java.util.*;
class athlete{
    Scanner sc = new Scanner(System.in);

    public int roundsCompleted(){
        System.out.println("Enter side 1: ");
        int side1 = sc.nextInt();
        System.out.println("Enter side 2: ");
        int side2 = sc.nextInt();
        System.out.println("Enter side 3: ");
        int side3 = sc.nextInt();
        int rounds = 5000/(side1 + side2 + side3);
        System.out.println("The number of rounds is "+rounds);
        return rounds;
    }
    public static void main(String[] args) {
        athlete triangle = new athlete();
        triangle.roundsCompleted();
    }}