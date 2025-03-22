import java.util.*;
public class KMtoMiles {
	public static void main(String[] args){
		Scanner z = new Scanner(System.in);
		System.out.print("Enter Kilometer ");
		double distkm = z.nextInt();
		double miles = 0.621371 * distkm;
		System.out.println("In miles = " + miles);
	}
}