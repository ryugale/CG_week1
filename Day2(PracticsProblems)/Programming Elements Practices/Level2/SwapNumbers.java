import java.util.*;
public class SwapNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;	
		System.out.printf("The swapped numbers are "+ num1 +" and "+num2);
	}
}
