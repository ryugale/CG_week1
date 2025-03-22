import java.util.*;
public class NaturalnumusingFor {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Number: ");
		int num = z.nextInt();
		int sum = 0;
		if (num >= 0) {
			sum = (num * (num + 1)) / 2;
			System.out.println("The sum of natural number is "+ sum );
			for (  sum = 0; num >= 0; num-- ){
				sum = sum + num;
		}
		System.out.println(" the sum using while loop is: " + sum);
		}
		}
	}