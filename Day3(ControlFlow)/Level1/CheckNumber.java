import java.util.*;
public class CheckNumber {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Number ");
		int num = z.nextInt();
		if (num > 0) {
			System.out.println("The number is Positive");
		}
		else if ( num < 0 ) {
			System.out.println("The number is Negative");
		}
		else {
			System.out.println("The number is Zero");
		}
	}
}