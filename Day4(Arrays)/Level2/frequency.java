import java.util.*;
class frequency {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       long number = sc.nextLong();


     
       long temp = number;
       int[] frequency = new int[10];


       while (temp != 0) {
           int digit = (int) (temp % 10);
           frequency[digit]++;
           temp /= 10;
       }


      
       System.out.println("Frequency of each digit:");
       for (int i = 0; i < frequency.length; i++) {
           if (frequency[i] > 0) {
               System.out.println("Digit " + i + ": " + frequency[i]);
           }
       }
   }
}