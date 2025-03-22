import java.util.*;
class factorial {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Number: ");
		int num = z.nextInt();
		int fact = 1;
		for ( fact = 1; num>0; num-- ) {
			fact = fact * num;
		}
		System.out.println("the factorial is : "+fact);	
	}
}