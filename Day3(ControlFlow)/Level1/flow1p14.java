import java.util.*;
class factorial {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Number: ");
		int num = z.nextInt();
		int fact = 1;
		while( num >= 1 ) {
			fact = fact * num;
			num--;
		}
		System.out.println("the factorial is : "+fact);	
	}
}