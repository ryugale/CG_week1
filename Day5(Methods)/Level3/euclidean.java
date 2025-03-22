import java.util.*;


public class euclidean {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter x1,y1 and x2,y2 seperated by space:  ");
       int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
       System.out.println(getDistance(x1, y1, x2, y2));
       System.out.println("Line Equation: "+ getEquationLine(x1, y1, x2, y2));  
   }
   static double getDistance(double x1,double y1,double x2,double y2){
       double distance = Math.sqrt(Math.pow(x2-x1, 2)) + Math.sqrt(Math.pow(y2-y1, 2));
       return distance;
   }
   static String getEquationLine(double x1,double y1,double x2,double y2){
       double m = (y2 - y1)/(x2-x1);
       double b = y1 - m * x1;
       return "y = " + m + " * x + " + b;
   }
}