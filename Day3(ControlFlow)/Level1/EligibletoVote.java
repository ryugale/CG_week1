import java.util.*;
public class EligibletoVote {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		int age = z.nextInt();
		if (age >= 18) {
			System.out.println("The person's age is "+ age +" and can vote.");
		}
		else {
			System.out.println("The person's age is "+ age +" and cannot vote.");
		}

	}
}