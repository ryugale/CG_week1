import java.util.Scanner;
public class CharacterFrequency {
   public static int[][] findCharacterFrequency(String text) {
       int[] frequency = new int[256];
       int length = text.length();
      
       for (int i = 0; i < length; i++) {
           frequency[text.charAt(i)]++;
       }
      
       int uniqueCount = 0;
       for (int i = 0; i < 256; i++) {
           if (frequency[i] > 0) {
               uniqueCount++;
           }
       }    
       int[][] result = new int[uniqueCount][2];
       int index = 0;
       for (int i = 0; i < 256; i++) {
           if (frequency[i] > 0) {
               result[index][0] = i;
               result[index][1] = frequency[i];
               index++;
           }
       }
       return result;
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String text = scanner.nextLine();
       scanner.close();

       int[][] result = findCharacterFrequency(text);
       System.out.println("Character Frequency:");
       for (int[] pair : result) {
           System.out.println((char) pair[0] + ": " + pair[1]);
       }
   }
}