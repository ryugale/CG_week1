import java.util.*;
public class bonus {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Salary: ");
		int salary = z.nextInt();
		System.out.print(" Enter Year of service: ");
		int years = z.nextInt();
		if (years > 5) {
			double bonus = salary * 0.05;
			System.out.print(" Bonus is: "+ bonus);
		} else {
			System.out.print(" not eligeble ");
		}
	}
}