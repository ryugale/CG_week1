
import java.util.*;

class leapyear {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int year = ip.nextInt();
        if (year < 1582 || year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " Is a leap year");
        } else {
            System.out.println(year + " Is not a leap year");
        }

    }

}

