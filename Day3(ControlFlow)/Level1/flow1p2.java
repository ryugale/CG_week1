import java.util.*;
class flow1p2 {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		int num1 = z.nextInt();
		int num2 = z.nextInt();
		int num3 = z.nextInt();
		
		System.out.println(" Is the first number the smallest? "+ (num1 < num2 && num2<num3));
	}
}