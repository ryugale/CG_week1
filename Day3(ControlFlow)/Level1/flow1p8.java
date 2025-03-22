import java.util.*;
class rocketlaunch {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Number: ");
		int num = z.nextInt();
		while ( num > 1 ) {
			num = num - 1;
			if (num == 0) break;
		System.out.println("CountDown : " + num);
		}
	}		
}