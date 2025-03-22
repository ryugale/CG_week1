import java.util.*;
class flow1p10 {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Number: ");
		int num = z.nextInt();
		double total = 0;
		while ( num != 0 ) {
			total = total + num;
			System.out.println("The total: "+total);
			num = z.nextInt();
		}
	}
}