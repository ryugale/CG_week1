import java.util.*;
class rocketlaunchforLoop {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		System.out.print(" Enter Number: ");
		int n = z.nextInt();
		for(int i = n; i >= 1 ; i--){
			System.out.println("CountDown : " + (i));
		}
	}		
}