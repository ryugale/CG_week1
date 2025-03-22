import java.util.*;
class oddoreven {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Number: ");
		int num = z.nextInt();
		if ( num <= 0 ){
			System.out.println(" please enter a natural number ");
		} else {
			for(int i = 1; i<= num; i++) {
				if (i % 2 == 0){
					System.out.println(i + " is an even number");
				} else {
					System.out.println(i + " is an odd number");
				}
			}
		}
	}
}
