import java.util.*;
public class SumofNaturalnum {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		int num = z.nextInt();
		int sum = (num * (num + 1)) / 2;
		if (num >= 0) {
			System.out.println("The sum of "+ num +" natural numbers is "+ sum);
		}
		else {
			System.out.println("The number "+ num +" is not a natural number");
		}

	}
}