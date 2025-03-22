import java.util.*;
public class SpringSeason {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Month: ");
		int month = z.nextInt();
		System.out.print(" Enter Day: ");
		int day = z.nextInt();
		if (month > 12 || day > 31) {
			System.out.println("invalid");
			}
			else if(month == 3 && day >= 20 && day <= 31) {
            System.out.println("Its a Spring Season");
		} else if (month == 4 && day >= 1 && day <= 30) {
            System.out.println("Its a Spring Season");
        } else if (month == 5 && day >= 1 && day <= 31) {
            System.out.println("Its a Spring Season");
        } else if (month == 6 && day >= 1 && day <= 20) {
			System.out.println("Its a Spring Season");
		} else {
			System.out.println("Not a Spring Season");}
	}		
}