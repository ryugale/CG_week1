import java.util.*;
class flow1p3 {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		int num1 = z.nextInt();
		int num2 = z.nextInt();
		int num3 = z.nextInt();
		System.out.println(" Is the first number the largest? "+(num1>num2 && num1>num3));
		System.out.println(" Is the second number the largest? "+(num2>num1 && num2>num3));
		System.out.println(" Is the third number the largest? "+(num3>num1 && num3>num2));
	}
}