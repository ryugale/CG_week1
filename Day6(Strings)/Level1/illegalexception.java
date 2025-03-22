import java.util.Scanner;
public class illegalexception {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = scanner.next();
      throwException(str);
      throwExceptionAndHandel(str);
   }
   static void throwException(String str){
       str.substring(3,1);
   }
   static void throwExceptionAndHandel(String str){
       try {
           str.substring(3,1);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
           System.out.println(e);
       }
   }
}