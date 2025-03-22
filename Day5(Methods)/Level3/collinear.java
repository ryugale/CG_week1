import java.util.*;
public class collinear {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter x1,y1, x2,y2 and x3,y3 seperated by space:  ");
       int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), x3 = sc.nextInt(), y3 = sc.nextInt();
       System.out.println("is Collinear? "+isCollinear(x1, y1, x2, y2, x3, y3));
      
   }
   static boolean isCollinear(double x1, double y1, double x2, double y2, double x3, double y3){
       double AB = (y2 - y1)/(x2 - x1);
       double BC = (y3 - y2)/(x3 - x3);
       double AC = (y3 - y1)/(x3 - x1);
       return (AB == BC) && (BC == AC);
   }
   static boolean collinear(double x1, double y1, double x2, double y2, double x3, double y3){
       double area =  0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
       return area == 0;
   }
}