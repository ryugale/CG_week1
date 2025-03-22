import java.util.*;
public class Divisibleby5 {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		int num = z.nextInt();
		System.out.println("Is the number "+ num +" divisible by 5? "+ (num % 5 == 0));
	}
}