import java.util.*;
public class TotalIncome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int salary = s.nextInt();
		int bonus = s.nextInt();
		int income = salary + bonus;
		System.out.printf("The salary is INR "+ salary +" and bonus is INR "+ bonus +" Hence Total Income is INR "+income);
	}
}
