import java.util.*;
public class calendar {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number fo the month: ");
       int monthNo = sc.nextInt();
       System.out.print("Enter Year: ");
       int year = sc.nextInt();
       String month = getMonthName(monthNo);
       int noOfDays = getNoOfDays(monthNo, year);
       int startingDay = getDayWithDate(1, monthNo, year);
       System.out.println(" " + month + " " + 2005);
       System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
       int date = 1;
       for (int i = 0; i < 6; i++) {
           int n = (i == 0) ? 7 - startingDay : 7;
           for (int j = 0; j < n; j++) {
               if (i == 0 && j == 0) {
                   for (int space = 0; space < startingDay; space++) {
                       System.out.print("    ");
                   }
               }
               if (date <= noOfDays)
                   if ((int) Math.log10(date) + 1 == 1)
                       System.out.print("   " + (date++));
                   else
                       System.out.print("  " + (date++));
           }
           System.out.println();
       }
   }
   public static String getMonthName(int no) {
       String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
       return months[no - 1];
   }
   public static int getNoOfDays(int no, int year) {
       if (no == 2) {
           if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
               return 29;
           } else
               return 28;
       }
       int[] noOfDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
       return noOfDays[no - 1];
   }
   public static int getDayWithDate(int date, int month, int year) {
       int y0 = year - (14 - month) / 12;
       int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
       int m0 = month + 12 * ((14 - month) / 12) - 2;
       int d0 = (date + x + 31 * m0 / 12) % 7;
       return d0;
   }
}