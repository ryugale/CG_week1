import java.util.*;
class flow1p12 {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Number: ");
		int num = z.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		if (num >= 0) {
			sum1 = (num * (num + 1)) / 2;
			System.out.println("The sum of natural number is "+ sum1 );
			while ( num >= 0) {
				sum2 = sum2 + num;
				num--;
		}
		System.out.println(" the sum using while loop is: " + sum2);
		}
		}
	}
